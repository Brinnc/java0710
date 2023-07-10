package org.sp.app0710.graphic;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;

/*
 자바의 모든 gui컴포넌트는 사실 스스로를 그려냄
 			[현실]			[자바]
 	1) 주체: 화가				컴포넌트
 	2) 그려질대상: 캔버스		컴포넌트
 	3) 그리는행위: 붓			paint()
 	4) 스타일: 팔레트			paint(Graphics g)
 								*현실에서의 팔레트보다 더 다양한 기능이 지원됨
 								예) 도형, 라인, 이미지, String 등	
 */

//모든 컴포넌트가 보유한 페인트메서드를 뺏ㄷ어서 개발자가 주도하여 그림을 그려봄
//repaint() 메서드 오버라이드
public class CustomButton extends JButton{
	
	public CustomButton(String title) {
		super(title); //부모생성자호출
		this.setPreferredSize(new Dimension(200, 200));
	}
	
	public void paint(Graphics g) {
		//System.out.println("뻇어 그렸지롱");
		//페인트 메서드는 Graphics객체를 사용하기위한 코드 영역일 뿐
		//사실 대부분의 그림은 그래픽스 객체가 담당함
		g.setColor(Color.ORANGE); //1) 그래픽스 객체의 페인트통의 색상을 변경
		g.fillRect(0, 0, 200, 200); //2) 채워진 사각형을 그림
	}
	
}
