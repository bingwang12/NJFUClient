package controller;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class FileSelectControl {
	public static void conduct(JFileChooser jfc,JTextField jtf) {
		jfc.setFileSelectionMode(0);
		int state = jfc.showOpenDialog(null);// 此句是打开文件选择器界面的触发语句
		if (state == 1) {
			return;// 撤销则返回
		} else {
			File f = jfc.getSelectedFile();// f为选择到的文件
			jtf.setText(f.getAbsolutePath());
		}
	}
}
