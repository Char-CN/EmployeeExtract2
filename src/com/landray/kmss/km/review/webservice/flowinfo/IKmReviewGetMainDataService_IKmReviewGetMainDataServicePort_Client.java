
package com.landray.kmss.km.review.webservice.flowinfo;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-06-30T16:03:09.519+08:00
 * Generated source version: 2.4.2
 * 
 */
public final class IKmReviewGetMainDataService_IKmReviewGetMainDataServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://flowinfo.webservice.review.km.kmss.landray.com/", "IKmReviewGetMainDataServiceService");

    private IKmReviewGetMainDataService_IKmReviewGetMainDataServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IKmReviewGetMainDataServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IKmReviewGetMainDataServiceService ss = new IKmReviewGetMainDataServiceService(wsdlURL, SERVICE_NAME);
        IKmReviewGetMainDataService port = ss.getIKmReviewGetMainDataServicePort();  
        
        {
        System.out.println("Invoking getKmReviewMainData...");
        java.lang.String _getKmReviewMainData_arg0 = "";
        java.lang.String _getKmReviewMainData_arg1 = "";
        java.lang.String _getKmReviewMainData_arg2 = "";
        java.lang.String _getKmReviewMainData_arg3 = "";
        java.lang.String _getKmReviewMainData_arg4 = "";
        java.lang.String _getKmReviewMainData_arg5 = "";
        java.lang.String _getKmReviewMainData_arg6 = "";
        try {
            java.lang.String _getKmReviewMainData__return = port.getKmReviewMainData(_getKmReviewMainData_arg0, _getKmReviewMainData_arg1, _getKmReviewMainData_arg2, _getKmReviewMainData_arg3, _getKmReviewMainData_arg4, _getKmReviewMainData_arg5, _getKmReviewMainData_arg6);
            System.out.println("getKmReviewMainData.result=" + _getKmReviewMainData__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
