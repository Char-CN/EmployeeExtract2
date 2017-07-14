package org.blazer.employeeextract2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 解析配置文件
 * 
 */
public class WebServiceConfig {
//	private static WebServiceConfig cfg = new WebServiceConfig();

	// Web服务的URL
	private String address;

	// Web服务接口
	private Class serviceClass;

	// Web服务标识
	private String serviceBean;

	// 用户
	private String user;

	// 密码
	private String password;

	public WebServiceConfig(String classPathFile) {
		Properties prop = new Properties();
		InputStream confStream = this.getClass().getResourceAsStream(classPathFile);

		try {
			prop.load(confStream);
			this.address = prop.getProperty("address");
			String serviceClassName = prop.getProperty("service_class");
			this.serviceClass = Class.forName(serviceClassName);
			this.serviceBean = prop.getProperty("service_bean");
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			System.out.println(this.address);
			System.out.println(this.serviceClass);
			System.out.println(this.serviceBean);
			System.out.println(this.user);
			System.out.println(this.password);
		} catch (Exception e) {
			// TODO 自动生成的catch块
			e.printStackTrace();
		} finally {
			try {
				confStream.close();
			} catch (IOException e) {
				// TODO 自动生成的catch块
				e.printStackTrace();
			}
		}
	}

//	public static WebServiceConfig getInstance() {
//		return cfg;
//	}

	/**
	 * 解析配置文件
	 */
	private void loadCfg() {

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Class getServiceClass() {
		return serviceClass;
	}

	public void setServiceClass(Class serviceClass) {
		this.serviceClass = serviceClass;
	}

	public String getServiceBean() {
		return serviceBean;
	}

	public void setServiceBean(String serviceBean) {
		this.serviceBean = serviceBean;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
