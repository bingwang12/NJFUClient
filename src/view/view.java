/**
 * 
 */
/**
 * 视图
 * @author WangBing
 *
 */
package view;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class view extends JFrame{
	public static int width=500;
	public static int height=300;
	
	public void initComponents() {
		//初始化内容界面，获得内容版面
		JPanel panel = (JPanel)getContentPane();
		//初始化选项卡界面
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
		//在主内容界面添加选项卡界面
		panel.add(jtp);
		
		//初始化导入面板
		JPanel importPanel = new JPanel();
		//添加button按钮 
		importPanel.add(new JButton("选择文件"));
		importPanel.add(new JButton("导入"));
		//在选项卡界面添加导入面板
		jtp.add("导入", importPanel);
		
		//初始化刷卡面板
		JPanel useCardPanel = new JPanel();
		//添加文本框
		useCardPanel.add(new JTextField(10));
		//在选项卡界面添加刷卡面板
		jtp.add("刷卡", useCardPanel);
		
		
		//初始化刷卡面板
		JPanel changeCardPanel = new JPanel();
		//添加文本
		changeCardPanel.add(new JLabel("学号："));
		//添加文本框
		changeCardPanel.add(new JTextField(10));
		changeCardPanel.add(new JLabel("转换     "));
		changeCardPanel.add(new JLabel("卡号："));
		changeCardPanel.add(new JTextField(10));
		changeCardPanel.add(new JButton("更新"));
		//在选项卡界面添加换卡面板
		jtp.add("换卡", changeCardPanel);
	}
	public view() {
		
/*
 * 初始化界面
 * 
 * 
 */
		//设软件标题
		setTitle("刷卡系统");  
		//设软件宽和高
        setSize(width, height);
        //设置退出程序按钮
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        //设置窗口显示位置
        setLocationRelativeTo(null);  
        //执行选项卡面板函数
        initComponents();
	}
	

	
}
