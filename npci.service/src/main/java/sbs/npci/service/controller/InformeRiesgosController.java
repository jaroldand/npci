package sbs.npci.service.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import sbs.npci.domain.entity.ConductaMercado;
import sbs.npci.domain.entity.Control;
import sbs.npci.domain.entity.GestionProducto;
import sbs.npci.domain.entity.ImpactAspect;
import sbs.npci.domain.entity.InformeDet;
import sbs.npci.domain.entity.InformeRel;
import sbs.npci.domain.entity.InformeRiesgosDomain;
import sbs.npci.domain.entity.Plan;
import sbs.npci.domain.entity.Riesgo;
import sbs.npci.domain.entity.dto.BandejaInformeDTO;
import sbs.npci.domain.entity.dto.InformeDTO;
import sbs.npci.service.controller.base.AsyncResult;
import sbs.npci.service.controller.base.HelperController;

@RestController
@RequestMapping("/informe_riesgos")
public class InformeRiesgosController {
	
	@Autowired
	private InformeRiesgosDomain informeRiesgosDomain;

	@GetMapping(value = "/search/informe/{idEntVig}")
	public DeferredResult<ResponseEntity<List<BandejaInformeDTO>>> obtenerInformesBandeja(@PathVariable String idEntVig) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<List<BandejaInformeDTO>>(informeRiesgosDomain.obtenerInformesBandeja(idEntVig), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/search/informe_hist/{idEntVig}/{anio}/{mes}")
	public DeferredResult<ResponseEntity<List<BandejaInformeDTO>>> obtenerEventosBandejaHistorica(@PathVariable String idEntVig, @PathVariable String anio, @PathVariable String mes) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<List<BandejaInformeDTO>>(informeRiesgosDomain.obtenerInformesBandejaHistorica(idEntVig, anio, mes), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/informe/{idInforme}")
	public DeferredResult<ResponseEntity<InformeDTO>> obtenerInforme(@PathVariable Integer idInforme) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<InformeDTO>(informeRiesgosDomain.obtenerInforme(idInforme), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/informeDet/{idInforme}")
	public DeferredResult<ResponseEntity<InformeDet>> obtenerInformeDet(@PathVariable Integer idInforme) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<InformeDet>(informeRiesgosDomain.loadInformeDet(idInforme), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/informeRel/{idInforme}")
	public DeferredResult<ResponseEntity<Map<String, InformeRel>>> obtenerInformeRel(@PathVariable Integer idInforme) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Map<String, InformeRel>>(informeRiesgosDomain.loadInformeRel(idInforme), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/condMerc/{idInformeDet}")
	public DeferredResult<ResponseEntity<Map<String, ConductaMercado>>> obtenerConductaMercado(@PathVariable Integer idInformeDet) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Map<String, ConductaMercado>>(informeRiesgosDomain.loadConductaMercado(idInformeDet), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/gestProd/{idInformeDet}")
	public DeferredResult<ResponseEntity<Map<String, GestionProducto>>> obtenerGestProd(@PathVariable Integer idInformeDet) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Map<String, GestionProducto>>(informeRiesgosDomain.loadGestProd(idInformeDet), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/riesgos/{idInformeDet}")
	public DeferredResult<ResponseEntity<Map<String, Riesgo>>> obtenerRiesgo(@PathVariable Integer idInformeDet) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Map<String, Riesgo>>(informeRiesgosDomain.loadRiesgo(idInformeDet), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/aspecto/{idInformeDet}")
	public DeferredResult<ResponseEntity<Map<String, ImpactAspect>>> obtenerAspecto(@PathVariable Integer idInformeDet) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Map<String, ImpactAspect>>(informeRiesgosDomain.loadAspecto(idInformeDet), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/control/{idGestProd}")
	public DeferredResult<ResponseEntity<Control>> obtenerControl(@PathVariable Integer idGestProd) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Control>(informeRiesgosDomain.loadControl(idGestProd), HttpStatus.OK);
		});
	}
	
	@GetMapping(value = "/load/plan/{idGestProd}")
	public DeferredResult<ResponseEntity<Plan>> obtenerPlan(@PathVariable Integer idGestProd) {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<Plan>(informeRiesgosDomain.loadPlan(idGestProd), HttpStatus.OK);
		});
	}
	
	@PostMapping(value = "/save/informe")
	public DeferredResult<ResponseEntity<InformeDTO>> saveEvento(@RequestBody InformeDTO parametros) {
		String user = HelperController.getCodUser();
		return AsyncResult.Call(() -> {
			return new ResponseEntity<InformeDTO>(informeRiesgosDomain.saveInforme(parametros, user), HttpStatus.OK);
		});
	}
	
	
}
