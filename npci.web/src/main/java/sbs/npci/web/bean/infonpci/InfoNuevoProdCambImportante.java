package sbs.npci.web.bean.infonpci;

import java.util.Date;
import java.util.List;


import sbs.npci.web.bean.infogeneralnpci.ArchivoBean;


public class InfoNuevoProdCambImportante {
	
	private String codTipoEvento;
	private String nombreNpci;
	private String antecedentesNpci;
	private String descripcionNpci;
	private ArchivoBean archivoDescripcionNpci;
	private String soporteInforNpci;
	private ArchivoBean archivoSoporteInforNpci;
	private String fecLanzamientoNpci;   //"YYYY-MM-DD H24:MI:SS"	
	private String fecImplementacionNpci;
	private List<CatImpacAspectos>  listImpacAspectos;
		

}
