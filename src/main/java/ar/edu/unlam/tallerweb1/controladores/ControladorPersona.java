package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPersona {
	@RequestMapping(path = "/saludo", method = RequestMethod.GET)
	public ModelAndView holaMundo() {

		return new ModelAndView("mensaje");

	}

	@RequestMapping(path = "/mostrar", method = RequestMethod.GET)
	public ModelAndView mostrar() {
		ModelMap modelo = new ModelMap();
		String apellido = "Gonzalez";
		String nombre = "Juan";
		modelo.put("apellido", apellido);
		modelo.put("nombre", nombre);
		return new ModelAndView("mostrar", modelo);
	}

	@RequestMapping(path = "/hola/amigo", method = RequestMethod.GET)
	public ModelAndView holaAmigo(@RequestParam("nombre") String nombre) {
		String mensaje = "Hola, " + nombre + "!";
		ModelMap modelo = new ModelMap();
		modelo.put("mensaje", mensaje);
		return new ModelAndView("saludar", modelo);
	}

}
