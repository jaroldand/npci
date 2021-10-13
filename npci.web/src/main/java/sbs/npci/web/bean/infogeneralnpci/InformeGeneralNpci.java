package sbs.npci.web.bean.infogeneralnpci;

import java.util.Date;
import java.util.List;

import sbs.npci.web.bean.infonpci.InfoNuevoProdCambImportante;
import sbs.npci.web.bean.riesgos.InfoIntegralRiesgo;

public class InformeGeneralNpci {
	
	private Long idInforme;	
	
	private InfoNuevoProdCambImportante infoNuevoProdCambImportante;//DATOS PRINC
	private	InfoIntegralRiesgo infoIntegralRiesgo;	
	private String aprobacionInfoRiesgo;
	private ArchivoBean  actaInfoRiesgos;
	private String fechaAprobInforme;
	
	private String comentarioAdicional;
	private ArchivoBean archivoComentarioAdicional;
	private List<InfoAsociados> listainfoAsociados; 
	private DatosContacto datosContacto;
	
	private String estadoInforme; //NPCI.TIPO_LISTA, COD_GRUPO=013

}
