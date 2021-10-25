package sbs.npci.domain.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import sbs.npci.cross.resources.ConstanteValor;
import sbs.npci.data.InformeRiesgosMapper;
import sbs.npci.domain.entity.base.BaseParam;
import sbs.npci.domain.entity.dto.BandejaInformeDTO;
import sbs.npci.domain.entity.dto.InformeDTO;

@Service
public class InformeRiesgosDomain {

	@Autowired
	private InformeRiesgosMapper mapper;
	@Autowired
	private InformeDomain informeDomain;
	@Autowired
	private InformeDetDomain informeDetDomain;
	@Autowired
	private InformeRelDomain informeRelDomain;
	@Autowired
	private CondMercDomain condMercDomain;
	@Autowired
	private GestProdDomain gestProdDomain;
	@Autowired
	private ImpactAspectDomain impactAspectDomain;
	@Autowired
	private ControlDomain controlDomain;
	@Autowired
	private PlanDomain planDomain;
	@Autowired
	private RiesgoDomain riesgoDomain;
	
	public List<BandejaInformeDTO> obtenerInformesBandeja(String idEntVig) {
		BaseParam<BandejaInformeDTO> param = new BaseParam<BandejaInformeDTO>();
		param.setKey(idEntVig);
		mapper.obtenerInformes(param);
		
		return param.getList();
	}

	public List<BandejaInformeDTO> obtenerInformesBandejaHistorica(String idEntVig, String anio, String mes) {
		Map<String, Object> keyMap = new HashMap<String, Object>();
		keyMap.put("Anio",  ConstanteValor.VALOR_TODOS.toUpperCase().equals(anio.toUpperCase()) ? "" : anio);
		keyMap.put("Mes",  ConstanteValor.VALOR_TODOS.toUpperCase().equals(mes.toUpperCase()) ? "" : mes);
		
		BaseParam<BandejaInformeDTO> param = new BaseParam<BandejaInformeDTO>();
		param.setKey(idEntVig);
		param.setKeyMap(keyMap);
		mapper.obtenerInformesHist(param);
		
		return param.getList();
	}

	public InformeDTO obtenerInforme(Integer idInforme) {
		InformeDTO resultado = new InformeDTO();
		
		Informe informe = informeDomain.getEntityByKey(idInforme, null);
		resultado.setInforme(informe);
		
		InformeDet informeDet = informeDetDomain.getEntityByKey(idInforme, null);
		resultado.setInformeDet(informeDet);
		
		InformeRelKey informeRelKey = new InformeRelKey();
		informeRelKey.setIdInforme(idInforme);
		InformeRel informeRel = new InformeRel();
		informeRel.setIdInformeRel(informeRelKey);
		List<InformeRel> informesRels = informeRelDomain.buscar(informeRel, null);
		resultado.setInformesRelacionados(informesRels);
		
		ConductaMercado condMerc = new ConductaMercado();
		condMerc.setIdInformeDet(informeDet.getIdInformeDet());
		List<ConductaMercado> condMercList = condMercDomain.buscar(condMerc, null);
		resultado.setConductasMercado(condMercList);
		
		GestionProducto gestProd = new GestionProducto();
		gestProd.setIdInformeDet(informeDet.getIdInformeDet());
		List<GestionProducto> gestProdList = gestProdDomain.buscar(gestProd, null);
		gestProdList.stream().forEach((p)-> {
			p.setCodigosPlan(planDomain.obtenerCodigosPlanbyGestProd(p.getIdGestProd()));
			p.setCodigosControl(controlDomain.obtenerCodigosControlbyGestProd(p.getIdGestProd()));
		});
		resultado.setGestionProdProy(gestProdList);
		
		ImpactAspect impactAspect = new ImpactAspect();
		impactAspect.setIdInformeDet(informeDet.getIdInformeDet());
		List<ImpactAspect> impactAspects = impactAspectDomain.buscar(impactAspect, null);
		resultado.setAspectos(impactAspects);
		
		Riesgo riesgo = new Riesgo();
		riesgo.setIdRiesgos(informeDet.getIdInformeDet());
		List<Riesgo> riesgos = riesgoDomain.buscar(riesgo, null);
		resultado.setRiesgos(riesgos);
		
		return resultado;
	}

	public InformeDet loadInformeDet(Integer idInforme) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, InformeRel> loadInformeRel(Integer idInforme) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, ConductaMercado> loadConductaMercado(Integer idInformeDet) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, GestionProducto> loadGestProd(Integer idInformeDet) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Riesgo> loadRiesgo(Integer idInformeDet) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, ImpactAspect> loadAspecto(Integer idInformeDet) {
		// TODO Auto-generated method stub
		return null;
	}

	public Control loadControl(Integer idControl) {
		Control control = controlDomain.getEntityByKey(idControl, null);
		return control;
	}

	public Plan loadPlan(Integer idPlan) {
		Plan plan = planDomain.getEntityByKey(idPlan, null);
		return plan;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public InformeDTO saveInforme(InformeDTO parametros, String user) {
		// Graba o actualiza Informe
		if( ObjectUtils.isEmpty(parametros.getInforme().getIdInforme() ) ) {			
			informeDomain.insertInforme(parametros.getInforme(), user);
		} else {
			informeDomain.updateByKey(parametros.getInforme().getIdInforme(), parametros.getInforme(), user);
		}
		// Graba o actualiza InformeDet
		if( ObjectUtils.isEmpty(parametros.getInformeDet().getIdInformeDet() ) ) {			
			informeDetDomain.insertInformeDet(parametros.getInformeDet(), user);
		} else {
			informeDetDomain.updateByKey(parametros.getInformeDet().getIdInformeDet(), parametros.getInformeDet(), user);
		}
		// Graba o actualiza ImpactAspect
		parametros.getAspectos().forEach((v)->{
			if( ObjectUtils.isEmpty(v.getIdImpactAspect()) ) {
				impactAspectDomain.insertImpactAspect(v, user); //nuevo registro
			} else {				
				impactAspectDomain.updateByKey(v.getIdImpactAspect(), v, user);
			}//update
		});
		// Graba o actualiza CondMercado
		parametros.getConductasMercado().forEach((v)->{
			if( ObjectUtils.isEmpty(v.getIdCondMerc()) ) {
				condMercDomain.insertCondMerc(v, user); //nuevo registro
			} else {				
				condMercDomain.updateByKey(v.getIdCondMerc(), v, user);
			}//update
		});
		// Graba o actualiza Riesgos
		parametros.getRiesgos().forEach((v)->{
			if( ObjectUtils.isEmpty(v.getIdRiesgos()) ) {
				riesgoDomain.insertRiesgo(v, user); //nuevo registro
			} else {				
				riesgoDomain.updateByKey(v.getIdRiesgos(), v, user);
			}//update
		});
		// Graba o actualiza GestProd
		parametros.getGestionProdProy().forEach((v)->{
			if( ObjectUtils.isEmpty(v.getIdGestProd()) ) {
				gestProdDomain.insertGestProd(v, user); //nuevo registro
				v.getControles().forEach((c)-> {
					c.setIdGestProd(v.getIdGestProd());
					controlDomain.insertControl(c, user);
				});
				v.getPlanes().forEach((p)-> {
					p.setIdGestProd(v.getIdGestProd());
					planDomain.insertPlan(p, user);
				});
			} else {				
				gestProdDomain.updateByKey(v.getIdGestProd(), v, user);
				v.getControles().forEach((c)-> {
					controlDomain.updateByKey(c.getIdControl(), c, user);
				});
				v.getPlanes().forEach((p)-> {
					planDomain.updateByKey(p.getIdPlan(), p, user);
				});
			}//update
		});
				
		return parametros;
	}

}
