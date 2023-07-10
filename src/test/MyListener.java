package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//리스너 재정의
public class MyListener implements ActionListener{
	EventTest et; //현재 null
	
	//public MyListener(EventTest et) {
	//	this.et=et;
	//}
	
	public void actionPerformed(ActionEvent e) {
		//area에 텍스트 추가
		et.area.append("눌렀어?\n");
		
	}
	
}
