/**
 * 
 */
package model;

import java.util.Date;

/**
 * 学生记录
 * 
 * @author WangZhiheng
 *
 */
public class StudentRecord {
	/**
	 * 学号
	 */
	private String ID;
	/**
	 * 次数
	 */
	private int score;
	/**
	 * 最后记录时间
	 */
	private Date lastRecord;

	/**
	 * 
	 */
	public StudentRecord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 构造函数
	 * 
	 * @param _ID
	 *            学号
	 * @param _score
	 *            次数
	 * @param _lastRecord
	 *            最后记录时间
	 */
	public StudentRecord(String _ID, int _score, Date _lastRecord) {
		setID(_ID);
		setScore(_score);
		setLastRecord(_lastRecord);
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
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the lastRecord
	 */
	public Date getLastRecord() {
		return lastRecord;
	}

	/**
	 * @param lastRecord
	 *            the lastRecord to set
	 */
	public void setLastRecord(Date lastRecord) {
		this.lastRecord = lastRecord;
	}

}
