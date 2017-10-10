package controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Record;

public class PayCardControl {
	public static void conduct(JTextField jtx,JLabel jlab,DBController dbc) {
		Date date = new Date();//获取当前时间数据
		Timestamp timestamp = new Timestamp(date.getTime()); //将date转换成datetime
		String cardNumber = jtx.getText();//获取文本框里面的卡号
		System.out.println(cardNumber);
		if(dbc.hasRecord(cardNumber)) {
			String id=dbc.getIDbyCardID(cardNumber);
			Record record=new Record(id, timestamp,false);//通过卡号初始化一条跑操记录
			dbc.insertRecord(record);//往Record里面插入跑操数据
			dbc.updateStudentRecord(id);//往StudentRecord里面更新学生成绩
			jlab.setText(id+"刷卡成功");
			jtx.setText("");//将卡号文本框里还原为空
		}else {
			jlab.setText("查无此人");
			jtx.setText("");//将卡号文本框里还原为空
		}
	}
}
