package sbs.npci.domain.entity;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.ImpactAspectMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class ImpactAspectDomain extends BaseDomain<ImpactAspect> {

	public ImpactAspectDomain(ImpactAspectMapper impactAspectMapper) {
		super.setMapper(impactAspectMapper);
	}
	
	public ImpactAspect insertImpactAspect(ImpactAspect impactAspect, String codUser) {

		impactAspect.setIdImpactAspect( (int) mapper.getSequenceLong() );
		impactAspect.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(impactAspect, codUser);
		
		return impactAspect;
	}
	
	public ImpactAspect obtenerImpactAspectById(Integer idImpactAspect) {
		
		ImpactAspect impactAspect = getEntityByKey(idImpactAspect, null);
		return impactAspect;
	}
}
