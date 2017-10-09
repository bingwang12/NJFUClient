/**
 * 
 */
package model;

import java.util.Date;

/**
 * 记录
 * 
 * @author WangZhiheng
 *
 */
public class Record {
	/**
	 * 学号
	 */
	private String ID;
	/**
	 * 时间
	 */
	private Date time;
	/**
	 * 已同步
	 */
	private boolean synced = false;

	/**
	 * 
	 */
	public Record() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 构造函数
	 * 
	 * @param _ID
	 *            学号
	 * @param _time
	 *            时间
	 * @param _synced
	 *            已同步
	 */
	public Record(String _ID, Date _time, boolean _synced) {
		setID(_ID);
		setTime(_time);
		setSynced(_synced);
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
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the synced
	 */
	public boolean isSynced() {
		return synced;
	}

	/**
	 * @param synced
	 *            the synced to set
	 */
	public void setSynced(boolean synced) {
		this.synced = synced;
	}

}
