package com.onlinetutorialspoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetutorialspoint.client.SoapClient;
import com.onlinetutorialspoint.response.Consulta;

@RestController
public class ConsultaController {

	@Autowired
	SoapClient soapClient;

	@PostMapping("/consulta")
	public com.onlinetutorialspoint.response.Acuse acuseRespose(@RequestBody Consulta cunsultaRequest) {
		return soapClient.getConsulta(cunsultaRequest);
	}
	
	

}
