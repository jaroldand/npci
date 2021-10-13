package sbs.npci.web.bean.riesgos;

import java.util.List;

import sbs.npci.web.bean.infogeneralnpci.ArchivoBean;

public class InfoIntegralRiesgo {
	
	private String codtipoRiesgo; //2.1 CATALOGO COD_GRUPO 004 TIPO 0 COD_GRUPO 014 TIPO 1
	private String opcAdicionalRiesgo; 
	
	private List<RiesgosAsoGestProyectNpci> listaRiesgosAsoGestProyect;
	private List<RiesgosAsoGestProyectNpci> listaRiegosNpci;
	
	private ArchivoBean informeRiesgosLAFT;
	
	private List<AspectosEvalCondMercado> listaAspectosEvalCondMercado;	
	

}
