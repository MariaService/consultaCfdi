
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.sat_cfdi_negocio_consultacfdi.Acuse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IConsultaCFDIService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.sat_cfdi_negocio_consultacfdi.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IConsultaCFDIService {


    /**
     * 
     * @param expresionImpresa
     * @return
     *     returns org.datacontract.schemas._2004._07.sat_cfdi_negocio_consultacfdi.Acuse
     */
    @WebMethod(operationName = "Consulta", action = "http://tempuri.org/IConsultaCFDIService/Consulta")
    @WebResult(name = "ConsultaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Consulta")
    @ResponseWrapper(localName = "ConsultaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaResponse")
    public Acuse consulta(
        @WebParam(name = "expresionImpresa", targetNamespace = "http://tempuri.org/")
        String expresionImpresa);

}
