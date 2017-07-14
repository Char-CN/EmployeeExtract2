package com.landray.kmss.km.review.webservice.flowinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-06-30T16:03:09.532+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://flowinfo.webservice.review.km.kmss.landray.com/", name = "IKmReviewGetMainDataService")
@XmlSeeAlso({ObjectFactory.class})
public interface IKmReviewGetMainDataService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getKmReviewMainData", targetNamespace = "http://flowinfo.webservice.review.km.kmss.landray.com/", className = "com.landray.kmss.km.review.webservice.flowinfo.GetKmReviewMainData")
    @WebMethod
    @ResponseWrapper(localName = "getKmReviewMainDataResponse", targetNamespace = "http://flowinfo.webservice.review.km.kmss.landray.com/", className = "com.landray.kmss.km.review.webservice.flowinfo.GetKmReviewMainDataResponse")
    public java.lang.String getKmReviewMainData(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.String arg6
    ) throws Exception_Exception;
}