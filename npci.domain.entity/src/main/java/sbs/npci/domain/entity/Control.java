package sbs.npci.domain.entity;

import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class Control extends BaseEntity {

	private Integer idControl;
	private Integer idGestProd;
	private String nombControl;
	private String detControl;
	private String nivelEfect;
	private Short indActivo;
	
	public Integer getIdControl() {
		return idControl;
	}
	public void setIdControl(Integer idControl) {
		this.idControl = idControl;
	}
	public Integer getIdGestProd() {
		return idGestProd;
	}
	public void setIdGestProd(Integer idGestProd) {
		this.idGestProd = idGestProd;
	}
	public String getNombControl() {
		return nombControl;
	}
	public void setNombControl(String nombControl) {
		this.nombControl = nombControl;
	}
	public String getDetControl() {
		return detControl;
	}
	public void setDetControl(String detControl) {
		this.detControl = detControl;
	}
	public String getNivelEfect() {
		return nivelEfect;
	}
	public void setNivelEfect(String nivelEfect) {
		this.nivelEfect = nivelEfect;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(detControl, 
							idControl, 
							idGestProd, 
							indActivo, 
							nivelEfect, 
							nombControl,
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
		Control other = (Control) obj;
		return Objects.equals(detControl, other.detControl) 
				&& Objects.equals(idControl, other.idControl)
				&& Objects.equals(idGestProd, other.idGestProd) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(nivelEfect, other.nivelEfect) 
				&& Objects.equals(nombControl, other.nombControl)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
}
