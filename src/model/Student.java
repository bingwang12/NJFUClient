/**
 * 
 */
package model;

/**
 * 学生
 * 
 * @author WangZhiheng
 *
 */
public class Student {

	/**
	 * 学号
	 */
	private String ID;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 卡号
	 */
	private String cardID;

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 构造函数
	 * 
	 * @param _ID
	 *            学号
	 * @param _name
	 *            姓名
	 * @param _cardID
	 *            卡号
	 */
	public Student(String _ID, String _name, String _cardID) {
		setID(_ID);
		setName(_name);
		setCardID(_cardID);
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cardID
	 */
	public String getCardID() {
		return cardID;
	}

	/**
	 * @param cardID
	 *            the cardID to set
	 */
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

}
