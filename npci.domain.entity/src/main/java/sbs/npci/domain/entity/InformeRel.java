package sbs.npci.domain.entity;

import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class InformeRel extends BaseEntity {

	private InformeRelKey idInformeRel;
	private Short indActivo;
	public InformeRelKey getIdInformeRel() {
		return idInformeRel;
	}
	public void setIdInformeRel(InformeRelKey idInformeRel) {
		this.idInformeRel = idInformeRel;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idInformeRel, 
							indActivo, 
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
		InformeRel other = (InformeRel) obj;
		return Objects.equals(idInformeRel, other.idInformeRel) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
	
}
