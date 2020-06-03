package com.berg.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.berg.model.Cancion;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String mostrarPrincipal(Model model) {
		List<Cancion> canciones = getLista();
		model.addAttribute("canciones", canciones);

		return "index";
	}

	private List<Cancion> getLista(){
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy");
		List<Cancion> lista = null;
		//String tituloCancion = "";
		try {
			lista = new LinkedList<>();
			
			Cancion cancion1 = new Cancion();
			cancion1.setId(1);
			cancion1.setTitulo("The Thrill is Gone");
			cancion1.setAutor("BB King");
			cancion1.setDuracion(11.59);
			cancion1.setImagen("BBKing.png");
			cancion1.setFechaEstreno(1980);
			cancion1.setEstatus("Activa");
			
    		Cancion cancion2 = new Cancion();
			cancion2.setId(2);
			cancion2.setTitulo("Hideaway");
			cancion2.setAutor("Jhon Mayall");
			cancion2.setDuracion(9.28);
			cancion2.setImagen("JohnMayall.png");
			cancion2.setFechaEstreno(2003);
			
			Cancion cancion3 = new Cancion();
			cancion3.setId(3);
			cancion3.setTitulo("Otra");
			cancion3.setAutor("Nadie");
			cancion2.setDuracion(5.33);
			cancion3.setImagen("blues.png");
			cancion3.setFechaEstreno(2000);
			cancion3.setEstatus("Inactiva");
			
			
			lista.add(cancion1);
			lista.add(cancion2);
			lista.add(cancion3);
			
			return lista;
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
}