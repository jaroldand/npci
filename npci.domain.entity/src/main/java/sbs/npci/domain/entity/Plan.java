package sbs.npci.domain.entity;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import sbs.npci.domain.entity.base.BaseEntity;

public class Plan extends BaseEntity {

	private Integer idPlan;
	private Integer idGestProd;
	private String nombPlan;
	private String detPlan;
	private String areaResp;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/Lima")
	private Date fecImplem;
	private Short indActivo;
	
	public Integer getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(Integer idPlan) {
		this.idPlan = idPlan;
	}
	public Integer getIdGestProd() {
		return idGestProd;
	}
	public void setIdGestProd(Integer idGestProd) {
		this.idGestProd = idGestProd;
	}
	public String getNombPlan() {
		return nombPlan;
	}
	public void setNombPlan(String nombPlan) {
		this.nombPlan = nombPlan;
	}
	public String getDetPlan() {
		return detPlan;
	}
	public void setDetPlan(String detPlan) {
		this.detPlan = detPlan;
	}
	public String getAreaResp() {
		return areaResp;
	}
	public void setAreaResp(String areaResp) {
		this.areaResp = areaResp;
	}
	public Date getFecImplem() {
		return fecImplem;
	}
	public void setFecImplem(Date fecImplem) {
		this.fecImplem = fecImplem;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(areaResp, 
							detPlan, 
							fecImplem, 
							idGestProd, 
							idPlan, 
							indActivo, 
							nombPlan,
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
		Plan other = (Plan) obj;
		return Objects.equals(areaResp, other.areaResp) 
				&& Objects.equals(detPlan, other.detPlan)
				&& Objects.equals(fecImplem, other.fecImplem) 
				&& Objects.equals(idGestProd, other.idGestProd)
				&& Objects.equals(idPlan, other.idPlan) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(nombPlan, other.nombPlan)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
}
