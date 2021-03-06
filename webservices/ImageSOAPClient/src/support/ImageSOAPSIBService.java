
package support;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImageSOAPSIBService", targetNamespace = "http://server/", wsdlLocation = "http://127.0.0.1:8989/ImageSOAP/?wsdl")
public class ImageSOAPSIBService
    extends Service
{

    private final static URL IMAGESOAPSIBSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMAGESOAPSIBSERVICE_EXCEPTION;
    private final static QName IMAGESOAPSIBSERVICE_QNAME = new QName("http://server/", "ImageSOAPSIBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8989/ImageSOAP/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGESOAPSIBSERVICE_WSDL_LOCATION = url;
        IMAGESOAPSIBSERVICE_EXCEPTION = e;
    }

    public ImageSOAPSIBService() {
        super(__getWsdlLocation(), IMAGESOAPSIBSERVICE_QNAME);
    }

    public ImageSOAPSIBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGESOAPSIBSERVICE_QNAME, features);
    }

    public ImageSOAPSIBService(URL wsdlLocation) {
        super(wsdlLocation, IMAGESOAPSIBSERVICE_QNAME);
    }

    public ImageSOAPSIBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGESOAPSIBSERVICE_QNAME, features);
    }

    public ImageSOAPSIBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageSOAPSIBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImageSOAPSEI
     */
    @WebEndpoint(name = "ImageSOAPSIBPort")
    public ImageSOAPSEI getImageSOAPSIBPort() {
        return super.getPort(new QName("http://server/", "ImageSOAPSIBPort"), ImageSOAPSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageSOAPSEI
     */
    @WebEndpoint(name = "ImageSOAPSIBPort")
    public ImageSOAPSEI getImageSOAPSIBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "ImageSOAPSIBPort"), ImageSOAPSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGESOAPSIBSERVICE_EXCEPTION!= null) {
            throw IMAGESOAPSIBSERVICE_EXCEPTION;
        }
        return IMAGESOAPSIBSERVICE_WSDL_LOCATION;
    }

}
