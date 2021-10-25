package sbs.npci.domain.entity;

import java.util.Objects;

public class InformeRelKey {
	private Integer idInformeDet;
	private Integer idInforme;
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
	@Override
	public int hashCode() {
		return Objects.hash(idInforme, 
				idInformeDet);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InformeRelKey other = (InformeRelKey) obj;
		return Objects.equals(idInforme, other.idInforme) 
				&& Objects.equals(idInformeDet, other.idInformeDet);
	}
	
}
