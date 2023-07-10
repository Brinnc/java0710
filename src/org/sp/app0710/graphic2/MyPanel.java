package org.sp.app0710.graphic2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	int x;
	int y;
	int z; //이미지 인덱스변수
	
	Toolkit kit=Toolkit.getDefaultToolkit(); //시스템에 의존적인 인스턴스는 자식을 생성할 필요없이 제공해줌
	Image[] image=new Image[10];
	
	public MyPanel() {
		for(int i=0; i<image.length; i++) {
			image[i]=kit.getImage("D:/morning/javase_workspace/app0710/res/hero/Attack__00"+i+".png");
			
		}
	}
	
	public void tick() {
		x+=5;
		y+=5;
	}
	
	public void imgTick() {
		z+=1;
		if(z==9) {
			z=0;
		}
	}
	
	public void paint(Graphics g) {
		//System.out.println("페인트호출");
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 650); //700x700 사각형채움
		
		g.setColor(Color.RED);
		g.fillOval(x, y, 40, 40);
		
		//이미지 그리기
		//추상클래스의 원칙: 자식
		//이미지 인스턴스를 얻어오는 방법은 여러가지 방법이 있음
		//1) Toolkit을 이용하는 방법 (해당 os에 의존적인 경로로 이미지를 얻는 방법)
		
		
		//g.drawImage(이미지객체, x, y, width, height, 이미지관찰자)
		g.drawImage(image[z], 20, 30, 100, 150, this);
	
	}
}
