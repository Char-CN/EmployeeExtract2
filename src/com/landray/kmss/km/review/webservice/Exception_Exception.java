
package com.landray.kmss.km.review.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-28T14:53:33.517+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "Exception", targetNamespace = "http://webservice.review.km.kmss.landray.com/")
public class Exception_Exception extends java.lang.Exception {
    
    private com.landray.kmss.km.review.webservice.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.landray.kmss.km.review.webservice.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.landray.kmss.km.review.webservice.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.landray.kmss.km.review.webservice.Exception getFaultInfo() {
        return this.exception;
    }
}