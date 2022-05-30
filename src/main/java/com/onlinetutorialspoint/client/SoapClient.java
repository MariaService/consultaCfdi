package com.onlinetutorialspoint.client;

import org.datacontract.schemas._2004._07.sat_cfdi_negocio_consultacfdi.Acuse;
import org.springframework.stereotype.Service;
import org.tempuri.ConsultaCFDIService;
import org.tempuri.IConsultaCFDIService;

import com.onlinetutorialspoint.response.Consulta;

@Service
public class SoapClient {

	public com.onlinetutorialspoint.response.Acuse getConsulta(Consulta consultaJson) {
		IConsultaCFDIService EstatusSAT = new ConsultaCFDIService().getBasicHttpBindingIConsultaCFDIService();
		Acuse acuse = EstatusSAT.consulta("re=" + consultaJson.getRfcEmisor().trim() + "&rr="
				+ consultaJson.getRfcReceptor().trim() + "&tt=" + consultaJson.getTotalComprobante().trim() + "&id="
				+ consultaJson.getIdComprobante().trim() + "&fe=" + consultaJson.getSelloDigitalEmisor().trim());
		com.onlinetutorialspoint.response.Acuse acuseJson = new com.onlinetutorialspoint.response.Acuse();
		acuseJson.setEstado(acuse.getEstado().getValue());
		acuseJson.setCodigoEstatus(acuse.getCodigoEstatus().getValue());
		acuseJson.setEsCancelable(acuse.getEsCancelable().getValue());
		acuseJson.setEstatusCancelacion(acuse.getEstatusCancelacion().getValue());
		acuseJson.setValidacionEFOS(acuse.getValidacionEFOS().getValue());
		return acuseJson;
	}

}
