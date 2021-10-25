package sbs.npci.domain.entity;

import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class ConductaMercado extends BaseEntity {
	private Integer idCondMerc;
	private Integer idInformeDet;
	private String 	debIndent;
	private String rubro;
	private String relevante;
	private String medidas;
	private String controles;
	private Short indActivo;
	
	public Integer getIdCondMerc() {
		return idCondMerc;
	}
	public void setIdCondMerc(Integer idCondMerc) {
		this.idCondMerc = idCondMerc;
	}
	public Integer getIdInformeDet() {
		return idInformeDet;
	}
	public void setIdInformeDet(Integer idInformeDet) {
		this.idInformeDet = idInformeDet;
	}
	public String getDebIndent() {
		return debIndent;
	}
	public void setDebIndent(String debIndent) {
		this.debIndent = debIndent;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public String getRelevante() {
		return relevante;
	}
	public void setRelevante(String relevante) {
		this.relevante = relevante;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}
	public String getControles() {
		return controles;
	}
	public void setControles(String controles) {
		this.controles = controles;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(controles, 
							debIndent, 
							idCondMerc, 
							idInformeDet, 
							indActivo, 
							medidas, 
							relevante, 
							rubro,
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
		ConductaMercado other = (ConductaMercado) obj;
		return Objects.equals(controles, other.controles) 
				&& Objects.equals(debIndent, other.debIndent)
				&& Objects.equals(idCondMerc, other.idCondMerc) 
				&& Objects.equals(idInformeDet, other.idInformeDet)
				&& Objects.equals(indActivo, other.indActivo) 
				&& Objects.equals(medidas, other.medidas)
				&& Objects.equals(relevante, other.relevante) 
				&& Objects.equals(rubro, other.rubro)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	

}
