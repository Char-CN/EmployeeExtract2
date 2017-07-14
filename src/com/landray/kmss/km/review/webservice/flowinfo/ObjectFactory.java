
package com.landray.kmss.km.review.webservice.flowinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.landray.kmss.km.review.webservice.flowinfo package. 
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

    private final static QName _GetKmReviewMainData_QNAME = new QName("http://flowinfo.webservice.review.km.kmss.landray.com/", "getKmReviewMainData");
    private final static QName _GetKmReviewMainDataResponse_QNAME = new QName("http://flowinfo.webservice.review.km.kmss.landray.com/", "getKmReviewMainDataResponse");
    private final static QName _Exception_QNAME = new QName("http://flowinfo.webservice.review.km.kmss.landray.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.landray.kmss.km.review.webservice.flowinfo
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
     * Create an instance of {@link GetKmReviewMainDataResponse }
     * 
     */
    public GetKmReviewMainDataResponse createGetKmReviewMainDataResponse() {
        return new GetKmReviewMainDataResponse();
    }

    /**
     * Create an instance of {@link GetKmReviewMainData }
     * 
     */
    public GetKmReviewMainData createGetKmReviewMainData() {
        return new GetKmReviewMainData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKmReviewMainData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://flowinfo.webservice.review.km.kmss.landray.com/", name = "getKmReviewMainData")
    public JAXBElement<GetKmReviewMainData> createGetKmReviewMainData(GetKmReviewMainData value) {
        return new JAXBElement<GetKmReviewMainData>(_GetKmReviewMainData_QNAME, GetKmReviewMainData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKmReviewMainDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://flowinfo.webservice.review.km.kmss.landray.com/", name = "getKmReviewMainDataResponse")
    public JAXBElement<GetKmReviewMainDataResponse> createGetKmReviewMainDataResponse(GetKmReviewMainDataResponse value) {
        return new JAXBElement<GetKmReviewMainDataResponse>(_GetKmReviewMainDataResponse_QNAME, GetKmReviewMainDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://flowinfo.webservice.review.km.kmss.landray.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
