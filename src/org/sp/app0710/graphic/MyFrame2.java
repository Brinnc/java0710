package org.sp.app0710.graphic;

import javax.swing.JFrame;

//자바의 gui컴포넌트 중, 그림을 그리기에 적당한 컴포넌트는 주로 컨테이너이지만
//애초에 컨테이너가 아니면서, 그림을 그릴 영역을 지원하기 위해 지원되는 컴포넌트가 있음
//java.awt.Canvas 임
public class MyFrame2 extends JFrame{
	MyCanvas can;
	
	public MyFrame2() {
		can=new MyCanvas();
		
		add(can); //디폴트로 센터에 부착됨
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}

}
