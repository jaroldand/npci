package sbs.npci.data;

import sbs.npci.data.base.BaseMapper;
import sbs.npci.domain.entity.ClaveValor;
import sbs.npci.domain.entity.TipoLista;
import sbs.npci.domain.entity.base.BaseParam;

public interface TipoListaMapper extends BaseMapper<TipoLista> {

	void selectListClaveValor(BaseParam<ClaveValor> param);
	
	void obtenerAniosHist(BaseParam<String> param);
}