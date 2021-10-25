package sbs.npci.domain.entity;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.CondMercMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class CondMercDomain extends BaseDomain<ConductaMercado> {

	public CondMercDomain(CondMercMapper condMercMapper) {
		super.setMapper(condMercMapper);
	}
	
	public ConductaMercado insertCondMerc(ConductaMercado condMerc, String codUser) {

		condMerc.setIdCondMerc( (int) mapper.getSequenceLong() );
		condMerc.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(condMerc, codUser);
		
		return condMerc;
	}
	
	public ConductaMercado obtenerEventoById(Integer idCondMerc) {
		
		ConductaMercado condMerc = getEntityByKey(idCondMerc, null);
		return condMerc;
	}
}
