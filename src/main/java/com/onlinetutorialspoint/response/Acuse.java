package com.onlinetutorialspoint.response;

public class Acuse {

	private String codigoEstatus;
	private String esCancelable;
	private String estado;
	private String estatusCancelacion;
	private String validacionEFOS;

	@Override
	public String toString() {
		return "Acuse [codigoEstatus=" + codigoEstatus + ", esCancelable=" + esCancelable + ", estado=" + estado
				+ ", estatusCancelacion=" + estatusCancelacion + ", validacionEFOS=" + validacionEFOS + "]";
	}

	public String getCodigoEstatus() {
		return codigoEstatus;
	}

	public void setCodigoEstatus(String codigoEstatus) {
		this.codigoEstatus = codigoEstatus;
	}

	public String getEsCancelable() {
		return esCancelable;
	}

	public void setEsCancelable(String esCancelable) {
		this.esCancelable = esCancelable;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstatusCancelacion() {
		return estatusCancelacion;
	}

	public void setEstatusCancelacion(String estatusCancelacion) {
		this.estatusCancelacion = estatusCancelacion;
	}

	public String getValidacionEFOS() {
		return validacionEFOS;
	}

	public void setValidacionEFOS(String validacionEFOS) {
		this.validacionEFOS = validacionEFOS;
	}

}
