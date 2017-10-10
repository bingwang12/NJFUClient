/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Date;

import controller.DBConnecter;
import controller.DBController;
import controller.ExcelImporter;
import model.Record;
import model.Student;
import model.StudentRecord;
import view.MainFrame;

/**
 * 主类
 * 
 * @author WangZhiheng
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
		MainFrame newMainframe=new MainFrame();
		newMainframe.setVisible(true);
=======
		DBController dbc = new DBController(new DBConnecter().getConnection("test"));
		System.out.println(dbc.insertStudentRecord(new StudentRecord("aaappp",20,new Date())));
		System.out.println(dbc.hasRecord("aaappp"));
>>>>>>> e66e8f4401a728600c6cca4ba4ec4502a1bbf0d1
	}

}
