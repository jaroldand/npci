package sbs.npci.data;

import sbs.npci.data.base.BaseMapper;
import sbs.npci.domain.entity.Plan;
import sbs.npci.domain.entity.base.BaseParam;

public interface PlanMapper extends BaseMapper<Plan> {

	void obtenerCodigosPlan(BaseParam<String> param);
}
