
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
@WebServiceClient(name = "TimeWSSIBService", targetNamespace = "http://sib/", wsdlLocation = "http://127.0.0.1:8967/TimeWS?wsdl")
public class TimeWSSIBService
    extends Service
{

    private final static URL TIMEWSSIBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TIMEWSSIBSERVICE_EXCEPTION;
    private final static QName TIMEWSSIBSERVICE_QNAME = new QName("http://sib/", "TimeWSSIBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8967/TimeWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TIMEWSSIBSERVICE_WSDL_LOCATION = url;
        TIMEWSSIBSERVICE_EXCEPTION = e;
    }

    public TimeWSSIBService() {
        super(__getWsdlLocation(), TIMEWSSIBSERVICE_QNAME);
    }

    public TimeWSSIBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TIMEWSSIBSERVICE_QNAME, features);
    }

    public TimeWSSIBService(URL wsdlLocation) {
        super(wsdlLocation, TIMEWSSIBSERVICE_QNAME);
    }

    public TimeWSSIBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TIMEWSSIBSERVICE_QNAME, features);
    }

    public TimeWSSIBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TimeWSSIBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TimeWSSEI
     */
    @WebEndpoint(name = "TimeWSSIBPort")
    public TimeWSSEI getTimeWSSIBPort() {
        return super.getPort(new QName("http://sib/", "TimeWSSIBPort"), TimeWSSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TimeWSSEI
     */
    @WebEndpoint(name = "TimeWSSIBPort")
    public TimeWSSEI getTimeWSSIBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sib/", "TimeWSSIBPort"), TimeWSSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TIMEWSSIBSERVICE_EXCEPTION!= null) {
            throw TIMEWSSIBSERVICE_EXCEPTION;
        }
        return TIMEWSSIBSERVICE_WSDL_LOCATION;
    }

}