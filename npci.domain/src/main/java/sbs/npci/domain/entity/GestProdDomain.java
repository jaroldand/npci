package sbs.npci.domain.entity;

import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.GestionProductoMapper;
import sbs.npci.domain.base.BaseDomain;

@Service
public class GestProdDomain extends BaseDomain<GestionProducto> {

	public GestProdDomain(GestionProductoMapper gestProdMapper) {
		super.setMapper(gestProdMapper);
	}
	
	public GestionProducto insertGestProd(GestionProducto gestProd, String codUser) {

		gestProd.setIdGestProd( (int) mapper.getSequenceLong() );
		gestProd.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(gestProd, codUser);
		
		return gestProd;
	}
	
	public GestionProducto obtenerEventoById(Integer idGestProd) {
		
		GestionProducto gestProd = getEntityByKey(idGestProd, null);
		return gestProd;
	}
}
