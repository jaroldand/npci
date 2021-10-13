package sbs.npci.web.bean.riesgos;

import java.util.List;

public class RiesgosAsoGestProyectNpci{
	private String descRiesgo;
	private String codtipoRiesgoNivel0; // 2.2  niveo 0 y 1
	private String codtipoRiesgoNivel1; // 2.2  niveo 0 y 1
	private String rptaRiesgoRelevante;
	private String rptaRiesgoAceptado;
	private String codRptaRiesgo;
	private String codExpEstimada;
	
	private List<ControlRiesgo> listaControlRiesgo;
	private List<PlanRiesgo> listaPlanRiesgo;

}
