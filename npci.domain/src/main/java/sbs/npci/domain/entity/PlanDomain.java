package sbs.npci.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.PlanMapper;
import sbs.npci.domain.base.BaseDomain;
import sbs.npci.domain.entity.base.BaseParam;

@Service
public class PlanDomain extends BaseDomain<Plan> {

	@Autowired
	private PlanMapper mapper;
	
	public PlanDomain(PlanMapper planMapper) {
		super.setMapper(planMapper);
	}
	
	public Plan insertPlan(Plan plan, String codUser) {

		plan.setIdPlan( (int) mapper.getSequenceLong() );
		plan.setIndActivo(ConstanteValor.IND_ACTIVO);
		
		insert(plan, codUser);
		
		return plan;
	}
	
	public Plan obtenerPlanById(Integer idPlan) {
		
		Plan plan = getEntityByKey(idPlan, null);
		return plan;
	}
	
	public List<String> obtenerCodigosPlanbyGestProd(Integer idGestProd) {
		BaseParam<String> param = new BaseParam<String>();
		param.setKey(idGestProd);
		mapper.obtenerCodigosPlan(param);
		
		return param.getList();
	}
}
