
package com.landray.kmss.km.review.webservice.flowinfo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-06-30T16:03:09.528+08:00
 * Generated source version: 2.4.2
 */

@WebFault(name = "Exception", targetNamespace = "http://flowinfo.webservice.review.km.kmss.landray.com/")
public class Exception_Exception extends java.lang.Exception {
    
    private com.landray.kmss.km.review.webservice.flowinfo.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.landray.kmss.km.review.webservice.flowinfo.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.landray.kmss.km.review.webservice.flowinfo.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.landray.kmss.km.review.webservice.flowinfo.Exception getFaultInfo() {
        return this.exception;
    }
}
