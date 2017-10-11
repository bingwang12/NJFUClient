/**
 * 
 */
package controller;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import model.Record;

/**
 * 记录同步器
 * 
 * @author WangZhiheng
 *
 */
public class RecordSyncer {
	/**
	 * 数据库控制器
	 */
	private DBController dbc;
	/**
	 * 服务器地址
	 */
	private String host;
	/**
	 * 路径
	 */
	private String path;

	/**
	 * 
	 */
	public RecordSyncer(DBController _dbc, String _host, String _path) {
		setDbc(_dbc);
		setHost(_host);
		setPath(_path);
	}

	/**
	 * 同步记录
	 * @param record 要同步的记录
	 */
	public void Sync(Record record) {
		/*try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpPost httppost = new HttpPost(targetURI);
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the dbc
	 */
	public DBController getDbc() {
		return dbc;
	}

	/**
	 * @param dbc
	 *            the dbc to set
	 */
	public void setDbc(DBController dbc) {
		this.dbc = dbc;
	}

}
