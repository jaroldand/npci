package sbs.npci.domain.entity;

import java.util.List;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.InformeRelMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class InformeRelDomain extends BaseDomain<InformeRel> {

	public InformeRelDomain(InformeRelMapper informeRelMapper) {
		super.setMapper(informeRelMapper);
	}
	
	public InformeRel insertInformeRel(InformeRel informeRel, String codUser) {

		informeRel.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(informeRel, codUser);
		
		return informeRel;
	}
	
	public List<InformeRel> obtenerInformesRelById(InformeRelKey idInformeRel) {
		InformeRel informeRel = new InformeRel();
		informeRel.setIdInformeRel(idInformeRel);
		List<InformeRel> informesRels = buscar(informeRel, null);
		return informesRels;
	}
}
