package sbs.npci.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import sbs.cross.config.Setup;
import sbs.cross.log.Record;
import sbs.extranet.autenticacion.javabean.UsuarioSession;
import sbs.npci.web.controller.base.AsyncResult;
import sbs.npci.web.controller.base.HelperController;
import sbs.npci.web.controller.base.SecurityService;

@Controller
@RequestMapping("/start")
public class StartController {

	@Autowired
	private SecurityService securityService;

	@GetMapping
	public DeferredResult<String> token(@RequestParam("token") String token, HttpServletRequest request) {
		return AsyncResult.Call(() -> {
			
			String url = HelperController.URL_ERROR;
			try {
				
		        UsuarioSession usuarioSession = (UsuarioSession) request.getSession().getAttribute("usuarioSession");
		        if(usuarioSession == null)
		        	throw new Exception("El usuario no existe.");
		        
		        url = Setup.getValueKey("uriRegistroNpci.properties", "start");
		        
 		        // INICIANDO SESIÓN
				securityService.autologin(usuarioSession.getC_c_usuario(), usuarioSession, request);
		        
			} catch (Exception e) {
				Record.error(e);
				url = HelperController.URL_ERROR;
				url += e.getMessage();
			}
		        
		        
			return "redirect:" + url;
		});

	}

	@GetMapping("/error")
	public ModelAndView error(@RequestParam("msg") String msg) {
		ModelAndView model = new ModelAndView("pub/global/error.html");
		model.addObject("msg", msg);
		return model;
	}

	@GetMapping("/irOpciones")
	public DeferredResult<String> login(HttpServletRequest request) {
		return AsyncResult.Call(() -> {
			String url = HelperController.URL_ERROR;
			HttpSession session = request.getSession(false);
			if(session != null) {
				session.invalidate();
			}
			url = Setup.getValueKey("urlBase.properties", "url_login_menu");
			return "redirect:" + url + "/menu.jsp";
		});
	}
	
	@GetMapping("/logout")
	public DeferredResult<String> logout(HttpServletRequest request) {
		return AsyncResult.Call(() -> {
			String url = HelperController.URL_ERROR;
			HttpSession session = request.getSession(false);
			if(session != null) {
				session.invalidate();
			}
						
			url = Setup.getValueKey("urlBase.properties", "url_logout_menu");
			return "redirect:" + url;
		});
	}	
	
	@GetMapping("/timeoutCoopac")
	public DeferredResult<String> timeout(HttpServletRequest request,HttpServletResponse response) {
		return AsyncResult.Call(() -> {
			HttpSession session = request.getSession(false);
			if(session != null) {
				session.invalidate();
			}			
			return "/pub/logout.html";
		});

	}
}
