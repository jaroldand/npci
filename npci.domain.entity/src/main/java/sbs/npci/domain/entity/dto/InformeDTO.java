package sbs.npci.domain.entity.dto;

import java.io.Serializable;
import java.util.List;

import sbs.npci.domain.entity.ConductaMercado;
import sbs.npci.domain.entity.GestionProducto;
import sbs.npci.domain.entity.ImpactAspect;
import sbs.npci.domain.entity.Informe;
import sbs.npci.domain.entity.InformeDet;
import sbs.npci.domain.entity.InformeRel;
import sbs.npci.domain.entity.Riesgo;

public class InformeDTO implements Serializable {

	private static final long serialVersionUID = 2832284443936775430L;

	private Informe informe;
	private InformeDet informeDet;
	private List<InformeRel> informesRelacionados;
	private List<ConductaMercado> conductasMercado;
	private List<GestionProducto> gestionProdProy;
	private List<Riesgo> riesgos;
	private List<ImpactAspect> aspectos;
	
	
	public Informe getInforme() {
		return informe;
	}
	public void setInforme(Informe informe) {
		this.informe = informe;
	}
	public InformeDet getInformeDet() {
		return informeDet;
	}
	public void setInformeDet(InformeDet informeDet) {
		this.informeDet = informeDet;
	}
	public List<InformeRel> getInformesRelacionados() {
		return informesRelacionados;
	}
	public void setInformesRelacionados(List<InformeRel> informesRelacionados) {
		this.informesRelacionados = informesRelacionados;
	}
	public List<ConductaMercado> getConductasMercado() {
		return conductasMercado;
	}
	public void setConductasMercado(List<ConductaMercado> conductasMercado) {
		this.conductasMercado = conductasMercado;
	}
	public List<GestionProducto> getGestionProdProy() {
		return gestionProdProy;
	}
	public void setGestionProdProy(List<GestionProducto> gestionProdProy) {
		this.gestionProdProy = gestionProdProy;
	}
	public List<Riesgo> getRiesgos() {
		return riesgos;
	}
	public void setRiesgos(List<Riesgo> riesgos) {
		this.riesgos = riesgos;
	}
	public List<ImpactAspect> getAspectos() {
		return aspectos;
	}
	public void setAspectos(List<ImpactAspect> aspectos) {
		this.aspectos = aspectos;
	}
			
}
