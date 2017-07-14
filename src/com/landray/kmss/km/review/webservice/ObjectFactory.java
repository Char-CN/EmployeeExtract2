
package com.landray.kmss.km.review.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.landray.kmss.km.review.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://webservice.review.km.kmss.landray.com/", "Exception");
    private final static QName _GetProcessInfos_QNAME = new QName("http://webservice.review.km.kmss.landray.com/", "getProcessInfos");
    private final static QName _GetProcessInfosResponse_QNAME = new QName("http://webservice.review.km.kmss.landray.com/", "getProcessInfosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.landray.kmss.km.review.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetProcessInfos }
     * 
     */
    public GetProcessInfos createGetProcessInfos() {
        return new GetProcessInfos();
    }

    /**
     * Create an instance of {@link GetProcessInfosResponse }
     * 
     */
    public GetProcessInfosResponse createGetProcessInfosResponse() {
        return new GetProcessInfosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.review.km.kmss.landray.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.review.km.kmss.landray.com/", name = "getProcessInfos")
    public JAXBElement<GetProcessInfos> createGetProcessInfos(GetProcessInfos value) {
        return new JAXBElement<GetProcessInfos>(_GetProcessInfos_QNAME, GetProcessInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessInfosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.review.km.kmss.landray.com/", name = "getProcessInfosResponse")
    public JAXBElement<GetProcessInfosResponse> createGetProcessInfosResponse(GetProcessInfosResponse value) {
        return new JAXBElement<GetProcessInfosResponse>(_GetProcessInfosResponse_QNAME, GetProcessInfosResponse.class, null, value);
    }

}
