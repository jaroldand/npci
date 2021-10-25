package sbs.npci.domain.entity;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import sbs.npci.domain.entity.base.BaseEntity;

public class InformeDet extends BaseEntity {

	private Integer idInformeDet;
	private Integer idInforme;
	private String tipoInforme;
	private String nombreNpci;
	private String antecendentes;
	private String descripcion;
	private String descripcionSop;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/Lima")
	private Date fecLanzImpl;
	private String aprobInforme;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/Lima")
	private Date fecAprob;
	private String comentAdic;
	private Short indActivo;
	public Integer getIdInformeDet() {
		return idInformeDet;
	}
	public void setIdInformeDet(Integer idInformeDet) {
		this.idInformeDet = idInformeDet;
	}
	public Integer getIdInforme() {
		return idInforme;
	}
	public void setIdInforme(Integer idInforme) {
		this.idInforme = idInforme;
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
	public String getAntecendentes() {
		return antecendentes;
	}
	public void setAntecendentes(String antecendentes) {
		this.antecendentes = antecendentes;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionSop() {
		return descripcionSop;
	}
	public void setDescripcionSop(String descripcionSop) {
		this.descripcionSop = descripcionSop;
	}
	public Date getFecLanzImpl() {
		return fecLanzImpl;
	}
	public void setFecLanzImpl(Date fecLanzImpl) {
		this.fecLanzImpl = fecLanzImpl;
	}
	public String getAprobInforme() {
		return aprobInforme;
	}
	public void setAprobInforme(String aprobInforme) {
		this.aprobInforme = aprobInforme;
	}
	public Date getFecAprob() {
		return fecAprob;
	}
	public void setFecAprob(Date fecAprob) {
		this.fecAprob = fecAprob;
	}
	public String getComentAdic() {
		return comentAdic;
	}
	public void setComentAdic(String comentAdic) {
		this.comentAdic = comentAdic;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(antecendentes, 
							aprobInforme, 
							comentAdic, 
							descripcion, 
							descripcionSop, 
							fecAprob, 
							fecLanzImpl,
							idInforme, 
							idInformeDet, 
							indActivo, 
							nombreNpci, 
							tipoInforme, 
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
		InformeDet other = (InformeDet) obj;
		return Objects.equals(antecendentes, other.antecendentes) 
				&& Objects.equals(aprobInforme, other.aprobInforme)
				&& Objects.equals(comentAdic, other.comentAdic) 
				&& Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(descripcionSop, other.descripcionSop) 
				&& Objects.equals(fecAprob, other.fecAprob)
				&& Objects.equals(fecLanzImpl, other.fecLanzImpl) 
				&& Objects.equals(idInforme, other.idInforme)
				&& Objects.equals(idInformeDet, other.idInformeDet) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(nombreNpci, other.nombreNpci) 
				&& Objects.equals(tipoInforme, other.tipoInforme)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
	
}
