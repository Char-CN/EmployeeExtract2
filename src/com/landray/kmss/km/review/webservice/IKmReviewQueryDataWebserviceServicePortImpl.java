
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.landray.kmss.km.review.webservice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-28T14:53:33.520+08:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "IKmReviewQueryDataWebserviceServiceService",
                      portName = "IKmReviewQueryDataWebserviceServicePort",
                      targetNamespace = "http://webservice.review.km.kmss.landray.com/",
                      wsdlLocation = "file:/Users/hyy/liucheng.xml",
                      endpointInterface = "com.landray.kmss.km.review.webservice.IKmReviewQueryDataWebserviceService")
                      
public class IKmReviewQueryDataWebserviceServicePortImpl implements IKmReviewQueryDataWebserviceService {

    private static final Logger LOG = Logger.getLogger(IKmReviewQueryDataWebserviceServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.landray.kmss.km.review.webservice.IKmReviewQueryDataWebserviceService#getProcessInfos(java.lang.String  arg0 ,)java.lang.String  arg1 ,)java.lang.String  arg2 )*
     */
    public java.lang.String getProcessInfos(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) throws Exception_Exception    { 
        LOG.info("Executing operation getProcessInfos");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new Exception_Exception("Exception...");
    }

}