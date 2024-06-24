package idat.com.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.com.modelo.Usuarios;
import idat.com.interfaz.IUsuarios;

@RestController
@RequestMapping("/rest_usu")
@CrossOrigin(origins = "http://localhost:4200")
public class RestUsuario {
	@Autowired
	private IUsuarios data;
	
	@GetMapping("/listar")
	public List<Usuarios> listar() {
		return (List<Usuarios>) data.findAll();
	}

	@GetMapping(value = "/buscar/{id}")
	public Optional<Usuarios> listarId(@PathVariable("id") Integer id) {
		return data.findById(id);
	}

	@PostMapping("/insertar")
	public void insertar(@RequestBody Usuarios usu) {
		data.save(usu);
	}

	@PutMapping("/modificar")
	public void modificar(@RequestBody Usuarios usu) {
		data.save(usu);
	}

	@DeleteMapping(value = "/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}
}
