package sbs.npci.domain.entity;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.RiesgoMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class RiesgoDomain extends BaseDomain<Riesgo> {

	public RiesgoDomain(RiesgoMapper riesgoMapper) {
		super.setMapper(riesgoMapper);
	}
	
	public Riesgo insertRiesgo(Riesgo riesgo, String codUser) {

		riesgo.setIdRiesgos( (int) mapper.getSequenceLong() );
		riesgo.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(riesgo, codUser);
		
		return riesgo;
	}
	
	public Riesgo obtenerRiesgoById(Integer idRiesgos) {
		
		Riesgo riesgo = getEntityByKey(idRiesgos, null);
		return riesgo;
	}
}
