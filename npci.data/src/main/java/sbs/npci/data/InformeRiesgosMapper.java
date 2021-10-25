package sbs.npci.data;

import sbs.npci.domain.entity.base.BaseParam;
import sbs.npci.domain.entity.dto.BandejaInformeDTO;

public interface InformeRiesgosMapper {

	void obtenerInformes(BaseParam<BandejaInformeDTO> param);
	
	void obtenerInformesHist(BaseParam<BandejaInformeDTO> param);
}
