package org.sp.app0710.graphic2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{
	JButton bt;
	JButton bt2;
	MyPanel p; //paint() 오버라이딩을 위해선 패널클래스가 따로 있어야함
	//JPanel p;
	//내부익명함수하다가 망함 3교시 11시 50분경
	
	public MainFrame() {
		
		bt=new JButton("이동");
		bt2=new JButton("이미지프레임");
		p=new MyPanel();

		
		setLayout(new FlowLayout());
		
		p.setPreferredSize(new Dimension(700, 650));
		
		add(bt);
		add(bt2);
		add(p);
		
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt.addActionListener(this);
		bt2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==bt) {
			//버튼을 누르면, 패널이 보유한 x,y 변수값을 변경하자
			p.tick();
			
			//버튼만 눌러서는 화면에 그래픽적 변화가 없으므로, 즉 다시 그려질 필요가 없었으므로 paint()가 호출되지 않음
			//따라서 버튼만 눌러서 그림을 다시 그리는 효과를 내려면 시스템에세 paint()를 호출하도록 요청해야함
			//이때 사용되는 메서드가 바로 repaint() 메서드임
			//repaint() --> update() : 기존 그림 싹 지우기 --> paint()
			p.repaint();
			
		}else if(obj==bt2) {
			//p.z++; 여기서 인덱스 변수를 직접 증가시켜도됨, 대신 [ if문(p.index>=p.image.length-1)->z=1 ]도 여기에 작성해야함
			p.imgTick();
			p.repaint();
		}
		
		
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
}
