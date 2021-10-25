package sbs.npci.domain.entity;

import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class ImpactAspect extends BaseEntity {

	private Integer idImpactAspect;
	private Integer idInformeDet;
	private String tipoImpactAspect;
	private String descripcion;
	private Short indActivo;
	
	public Integer getIdImpactAspect() {
		return idImpactAspect;
	}
	public void setIdImpactAspect(Integer idImpactAspect) {
		this.idImpactAspect = idImpactAspect;
	}
	public Integer getIdInformeDet() {
		return idInformeDet;
	}
	public void setIdInformeDet(Integer idInformeDet) {
		this.idInformeDet = idInformeDet;
	}
	public String getTipoImpactAspect() {
		return tipoImpactAspect;
	}
	public void setTipoImpactAspect(String tipoImpactAspect) {
		this.tipoImpactAspect = tipoImpactAspect;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, 
							idImpactAspect, 
							idInformeDet, 
							indActivo, 
							tipoImpactAspect,
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
		ImpactAspect other = (ImpactAspect) obj;
		return Objects.equals(descripcion, other.descripcion) 
				&& Objects.equals(idImpactAspect, other.idImpactAspect)
				&& Objects.equals(idInformeDet, other.idInformeDet) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(tipoImpactAspect, other.tipoImpactAspect)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
}
