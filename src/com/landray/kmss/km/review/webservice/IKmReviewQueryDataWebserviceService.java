package com.landray.kmss.km.review.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-28T14:53:33.526+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://webservice.review.km.kmss.landray.com/", name = "IKmReviewQueryDataWebserviceService")
@XmlSeeAlso({ObjectFactory.class})
public interface IKmReviewQueryDataWebserviceService {

    @WebMethod
    @RequestWrapper(localName = "getProcessInfos", targetNamespace = "http://webservice.review.km.kmss.landray.com/", className = "com.landray.kmss.km.review.webservice.GetProcessInfos")
    @ResponseWrapper(localName = "getProcessInfosResponse", targetNamespace = "http://webservice.review.km.kmss.landray.com/", className = "com.landray.kmss.km.review.webservice.GetProcessInfosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getProcessInfos(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    ) throws Exception_Exception;
}
