package controller;

import javax.swing.JTextField;

public class UpdateCardControl {
	public static void conduct(JTextField jtx_Student,JTextField jtx_Card,DBController dbc) {
		String Studentnumber = jtx_Student.getText();//获取学生的学号
		String Cardnumber = jtx_Card.getText();//获取新的卡号
		dbc.updateCardID(Studentnumber, Cardnumber);//更新卡号	
	}
}
