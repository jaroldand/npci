package sbs.npci.domain.entity;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.cross.resources.TipoValor;
import sbs.npci.data.InformeMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class InformeDomain extends BaseDomain<Informe> {

	public InformeDomain(InformeMapper informeMapper) {
		super.setMapper(informeMapper);
	}
	
	public Informe insertInforme(Informe informe, String codUser) {

		informe.setIdInforme( (int) mapper.getSequenceLong() );
		informe.setIdEstado(TipoValor.NPCI_ID_INFORME_ESTADO_BORRADOR);
		informe.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(informe, codUser);
		
		return informe;
	}
	
	public Informe obtenerEventoById(Integer idInforme) {
		
		Informe informe = getEntityByKey(idInforme, null);
		return informe;
	}
}
