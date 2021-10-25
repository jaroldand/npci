package sbs.npci.domain.entity.dto;

import java.io.Serializable;

public class BandejaInformeDTO implements Serializable {

	private static final long serialVersionUID = -3298475607026008600L;

	private int idInforme;
	private String codExpediente;
	private String tipoInforme;
	private String nombreNpci;
	private String fechaLanzImpl;
	private String fechaEnvio;
	private String idEstado;
	private String descEstado;
	private String isEditar;
	private String isEliminar;
	
	public int getIdInforme() {
		return idInforme;
	}
	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}
	public String getCodExpediente() {
		return codExpediente;
	}
	public void setCodExpediente(String codExpediente) {
		this.codExpediente = codExpediente;
	}
	public String getTipoInforme() {
		return tipoInforme;
	}
	public void setTipoInforme(String tipoInforme) {
		this.tipoInforme = tipoInforme;
	}
	public String getNombreNpci() {
		return nombreNpci;
	}
	public void setNombreNpci(String nombreNpci) {
		this.nombreNpci = nombreNpci;
	}
	public String getFechaLanzImpl() {
		return fechaLanzImpl;
	}
	public void setFechaLanzImpl(String fechaLanzImpl) {
		this.fechaLanzImpl = fechaLanzImpl;
	}
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public String getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}
	public String getDescEstado() {
		return descEstado;
	}
	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}
	public String getIsEditar() {
		return isEditar;
	}
	public void setIsEditar(String isEditar) {
		this.isEditar = isEditar;
	}
	public String getIsEliminar() {
		return isEliminar;
	}
	public void setIsEliminar(String isEliminar) {
		this.isEliminar = isEliminar;
	}
	
	
}
