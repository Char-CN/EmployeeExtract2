package org.blazer.employeeextract2;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.alibaba.fastjson.JSON;
import com.landray.kmss.km.review.webservice.IKmReviewQueryDataWebserviceService;
import com.landray.kmss.km.review.webservice.flowinfo.IKmReviewGetMainDataService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * WebService客户端
 * 
 */
public class WebServiceClient {

	/**
	 * 主方法
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		func1();
		func2();
	}

	public static void func1() throws Exception {
		WebServiceConfig cfg = new WebServiceConfig("client.properties");

		Object service = callService(cfg);
		// 请在此处添加业务代码
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		IKmReviewGetMainDataService iServer = (IKmReviewGetMainDataService) service;
		String str = iServer.getKmReviewMainData("15bdd285f6e2165a14c2d724a17ad2ae", null, null, null, "2017-05-12 00:00:00", null, "002");
		HashMap<String, Object> map = JSON.parseObject(str, HashMap.class);
		System.out.println(map);
		System.out.println(map.get("datas"));
		System.out.println(str);
		System.out.println("执行结束时间：" + sdf.format(new Date()));

	}

	public static void func2() throws Exception {
		WebServiceConfig cfg = new WebServiceConfig("client2.properties");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Object service = callService(cfg);
		// 请在此处添加业务代码
		IKmReviewQueryDataWebserviceService iService = (IKmReviewQueryDataWebserviceService) service;

		String templateIds = "15bdd285f6e2165a14c2d724a17ad2ae";
		String modelIds = null;// "1593ef2dae124ee27325f2e4106ac426";
		// String params = "{'rowSize':1000, 'pageNo':1, 'status':'10;11;30'}";
		String params = null;// "{'rowSize':1000, 'pageNo':1, 'status':'20'}";
		System.out.println("执行开始时间：" + sdf.format(new Date()));
		String string = iService.getProcessInfos(templateIds, modelIds, params);
		System.out.println(string);
		System.out.println("执行结束时间：" + sdf.format(new Date()));

	}

	/**
	 * 调用服务，生成客户端的服务代理
	 * 
	 * @param address
	 *            WebService的URL
	 * @param serviceClass
	 *            服务接口全名
	 * @return 服务代理对象
	 * @throws Exception
	 */
	public static Object callService(WebServiceConfig cfg) throws Exception {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		// 记录入站消息
		factory.getInInterceptors().add(new LoggingInInterceptor());

		// 记录出站消息
		factory.getOutInterceptors().add(new LoggingOutInterceptor());

		// 添加消息头验证信息。如果服务端要求验证用户密码，请加入此段代码
		factory.getOutInterceptors().add(new AddSoapHeader(cfg));

		factory.setServiceClass(cfg.getServiceClass());
		factory.setAddress(cfg.getAddress());

		// 使用MTOM编码处理消息。如果需要在消息中传输文档附件等二进制内容，请加入此段代码
		// Map<String, Object> props = new HashMap<String, Object>();
		// props.put("mtom-enabled", Boolean.TRUE);
		// factory.setProperties(props);

		// 创建服务代理并返回
		return factory.create();
	}

}
