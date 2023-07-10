package org.sp.app0710.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

//캔버스를 오버라이드 하기위한 코드 작성
//캔버스는 현실의 도화지를 표현한 컴포넌트이므로, 최초에 아무것도 그려져있지 않은 빈 상태임
//따라서 개발자가 주도하여 원하는 그림을 그려야 함
public class MyCanvas extends Canvas{
	
	public void paint(Graphics g) {
		g.setColor(Color.YELLOW); //1) 페인트통 노란색 설정
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.BLUE); //다른 색상을 적용하고 싶다면, 무언가를 그릴때마다 색상을 적용해줘야함
		g.drawString("최승아", 50, 150);
		
		g.setColor(Color.RED);
		g.drawLine(0, 0, 150, 300); //(0,0)의 점에서 (150,300)의 점까지 선을 그림.
	
	}
}
