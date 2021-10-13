package sbs.npci.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import sbs.npci.domain.entity.TipoLista;
import sbs.npci.domain.entity.TipoListaDomain;
import sbs.npci.service.controller.base.AsyncResult;
import sbs.npci.service.controller.base.BaseController;

@RestController
@RequestMapping("/tipos")
public class TipoListaController extends BaseController<TipoLista, String> {

	public TipoListaController(TipoListaDomain domain) {
		super.setDomain(domain);
	}
	
	@GetMapping(value = "/anios_hist")
	public DeferredResult<ResponseEntity<List<String>>> obtenerAniosHist() {
		return AsyncResult.Call(() -> {
			return new ResponseEntity<List<String>>(((TipoListaDomain) domain).obtenerAniosHist(), HttpStatus.OK);
		});
	}
	
}
