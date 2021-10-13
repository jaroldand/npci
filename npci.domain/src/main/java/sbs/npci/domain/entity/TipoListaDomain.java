package sbs.npci.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbs.cross.util.exception.BusinessAsyncException;
import sbs.cross.util.exception.LevelType;
import sbs.cross.util.exception.StatusCode;
import sbs.npci.data.TipoListaMapper;
import sbs.npci.domain.base.BaseDomain;
import sbs.npci.domain.base.DomainProperties;
import sbs.npci.domain.entity.base.BaseParam;

@Service
public class TipoListaDomain extends BaseDomain<TipoLista> {

	@Autowired
	private TipoListaMapper mapper;
	

	public List<ClaveValor> listaPorGrupo(String codGrupo) {
		BaseParam<ClaveValor> param = new BaseParam<>();
		param.setKey(codGrupo);
		mapper.selectListClaveValor(param);
		if (param.getList() == null || param.getList().size() <= 0)
			throw new BusinessAsyncException(DomainProperties.NO_EXISTE, LevelType.WARNING, StatusCode.NO_FOUND);
		return param.getList();
	}
	
	public List<TipoLista> listaPorKey(String likeKey) {
		BaseParam<TipoLista> param = new BaseParam<>();
		param.setKey(likeKey);
		mapper.selectByPrimaryKey(param);
		if (param.getList() == null || param.getList().size() <= 0)
			throw new BusinessAsyncException(DomainProperties.NO_EXISTE, LevelType.WARNING, StatusCode.NO_FOUND);
		
		return param.getList();
	}
	
	public List<String> obtenerAniosHist() {
		
		BaseParam<String> param = new BaseParam<String>();
		mapper.obtenerAniosHist(param);
		
		return param.getList();
	}

}