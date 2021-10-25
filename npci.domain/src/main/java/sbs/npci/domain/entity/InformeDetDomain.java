package sbs.npci.domain.entity;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.InformeDetMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class InformeDetDomain extends BaseDomain<InformeDet> {

	public InformeDetDomain(InformeDetMapper informeDetMapper) {
		super.setMapper(informeDetMapper);
	}
	
	public InformeDet insertInformeDet(InformeDet informeDet, String codUser) {

		informeDet.setIdInforme( (int) mapper.getSequenceLong() );
		informeDet.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(informeDet, codUser);
		
		return informeDet;
	}
	
	public InformeDet obtenerInformeDetById(Integer idInformeDet) {
		
		InformeDet informeDet = getEntityByKey(idInformeDet, null);
		return informeDet;
	}
}
