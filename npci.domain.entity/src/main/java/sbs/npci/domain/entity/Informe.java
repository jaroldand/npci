package sbs.npci.domain.entity;

import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class Informe extends BaseEntity {

	private Integer idInforme;
	private String codEntVigilada;
	private String codExpediente;
	private String idEstado;
	private String nivel;
	private Short indActivo;
	public Integer getIdInforme() {
		return idInforme;
	}
	public void setIdInforme(Integer idInforme) {
		this.idInforme = idInforme;
	}
	public String getCodEntVigilada() {
		return codEntVigilada;
	}
	public void setCodEntVigilada(String codEntVigilada) {
		this.codEntVigilada = codEntVigilada;
	}
	public String getCodExpediente() {
		return codExpediente;
	}
	public void setCodExpediente(String codExpediente) {
		this.codExpediente = codExpediente;
	}
	public String getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codEntVigilada, 
							codExpediente, 
							idEstado, 
							idInforme, 
							indActivo, 
							nivel, 
							this.getAuditUserCrea(),
							this.getAuditFecCrea(),
							this.getAuditUserMod(),
							this.getAuditFecMod());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Informe other = (Informe) obj;
		return Objects.equals(codEntVigilada, other.codEntVigilada)
				&& Objects.equals(codExpediente, other.codExpediente) 
				&& Objects.equals(idEstado, other.idEstado)
				&& Objects.equals(idInforme, other.idInforme) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(nivel, other.nivel)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
}
