
package support;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ImageSOAPSEI", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImageSOAPSEI {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadImage", targetNamespace = "http://server/", className = "support.UploadImage")
    @ResponseWrapper(localName = "uploadImageResponse", targetNamespace = "http://server/", className = "support.UploadImageResponse")
    @Action(input = "http://server/ImageSOAPSEI/uploadImageRequest", output = "http://server/ImageSOAPSEI/uploadImageResponse")
    public String uploadImage(
        @WebParam(name = "arg0", targetNamespace = "")
        byte[] arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadImage", targetNamespace = "http://server/", className = "support.DownloadImage")
    @ResponseWrapper(localName = "downloadImageResponse", targetNamespace = "http://server/", className = "support.DownloadImageResponse")
    @Action(input = "http://server/ImageSOAPSEI/downloadImageRequest", output = "http://server/ImageSOAPSEI/downloadImageResponse")
    public byte[] downloadImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
