package sbs.npci.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.ControlMapper;
import sbs.npci.domain.base.BaseDomain;
import sbs.npci.domain.entity.base.BaseParam;

@Service
public class ControlDomain extends BaseDomain<Control> {

	@Autowired
	private ControlMapper mapper;
	
	public ControlDomain(ControlMapper controlMapper) {
		super.setMapper(controlMapper);
	}
	
	public Control insertControl(Control control, String codUser) {

		control.setIdControl( (int) mapper.getSequenceLong() );
		control.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(control, codUser);
		
		return control;
	}
	
	public Control obtenerControlById(Integer idControl) {
		
		Control control = getEntityByKey(idControl, null);
		return control;
	}

	public List<String> obtenerCodigosControlbyGestProd(Integer idGestProd) {
		BaseParam<String> param = new BaseParam<String>();
		param.setKey(idGestProd);
		mapper.obtenerCodigosControl(param);
		
		return param.getList();
	}
}
