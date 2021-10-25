package sbs.npci.data;

import sbs.npci.data.base.BaseMapper;
import sbs.npci.domain.entity.Control;
import sbs.npci.domain.entity.base.BaseParam;

public interface ControlMapper extends BaseMapper<Control> {

	void obtenerCodigosControl(BaseParam<String> param);
}
