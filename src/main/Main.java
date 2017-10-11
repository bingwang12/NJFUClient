/**
 * 
 */
package main;

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

		MainFrame newMainframe = new MainFrame();
		newMainframe.setVisible(true);

		// DBController dbc = new DBController(new DBConnecter().getConnection("test"));
		// System.out.println(dbc.insertStudentRecord(new StudentRecord("aaappp",20,new
		// Date())));
		// System.out.println(dbc.hasRecord("aaappp"));

	}

}
