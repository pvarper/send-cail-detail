package micrium.calldetail.model;

import java.io.Serializable;

public class TBol_Linea implements Serializable {
	private static final long serialVersionUID = 1L;

	private String contrato;
	private String linea;
	private String cod_ticket;
	private String estado;
	private java.util.Date Fecha_inicial;
	private java.util.Date  Fecha_Final;
	public TBol_Linea() {
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getContrato() {
		return contrato;
	}
	
	public String getCod_ticket() {
		return cod_ticket;
	}

	public void setCod_ticket(String cod_ticket) {
		this.cod_ticket = cod_ticket;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}

	public java.util.Date getFecha_inicial() {
		return Fecha_inicial;
	}

	public void setFecha_inicial(java.util.Date fecha_inicial) {
		Fecha_inicial = fecha_inicial;
	}

	public java.util.Date getFecha_Final() {
		return Fecha_Final;
	}

	public void setFecha_Final(java.util.Date fecha_Final) {
		Fecha_Final = fecha_Final;
	}

	
}