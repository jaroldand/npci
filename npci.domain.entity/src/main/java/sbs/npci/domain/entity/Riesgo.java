package sbs.npci.domain.entity;

import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class Riesgo extends BaseEntity {

	private Integer idRiesgos;
	private Integer idInformeDet;
	private String tipoRiesgos;
	private Short indActivo;
	
	public Integer getIdRiesgos() {
		return idRiesgos;
	}
	public void setIdRiesgos(Integer idRiesgos) {
		this.idRiesgos = idRiesgos;
	}
	public Integer getIdInformeDet() {
		return idInformeDet;
	}
	public void setIdInformeDet(Integer idInformeDet) {
		this.idInformeDet = idInformeDet;
	}
	public String getTipoRiesgos() {
		return tipoRiesgos;
	}
	public void setTipoRiesgos(String tipoRiesgos) {
		this.tipoRiesgos = tipoRiesgos;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idInformeDet, 
							idRiesgos, 
							indActivo, 
							tipoRiesgos,
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
		Riesgo other = (Riesgo) obj;
		return Objects.equals(idInformeDet, other.idInformeDet) 
				&& Objects.equals(idRiesgos, other.idRiesgos)
				&& Objects.equals(indActivo, other.indActivo) 
				&& Objects.equals(tipoRiesgos, other.tipoRiesgos)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
}
