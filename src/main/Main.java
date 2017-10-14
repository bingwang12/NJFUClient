/**
 * 
 */
package main;

import java.math.BigInteger;
import java.sql.Blob;
import java.util.Date;

import controller.DBConnecter;
import controller.DBController;
import controller.RecordSyncer;
import model.Record;
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

		// Date dt=new Date();
		// DBController dbct = new DBController((new
		// DBConnecter()).getConnection("test"));
		// RecordSyncer rs = new RecordSyncer(dbct, "120.27.122.238",
		// "/NJFUTest/basic/web/index.php");
		// String response = rs.Sync(new Record("2", dt, false));
		// long Scret=Integer.parseInt("2")+dt.getTime();
		// long Scret1=Scret/333;
		// System.out.println(response);
		// System.out.println(Scret1);
		MainFrame newMainframe = new MainFrame();
		newMainframe.setVisible(true);

	}

}
