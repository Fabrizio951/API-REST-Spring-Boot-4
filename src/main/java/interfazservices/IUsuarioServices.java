package interfazservices;

import java.util.List;
import java.util.Optional;

import idat.com.modelo.Usuarios;

public interface IUsuarioServices {

	public List<Usuarios> listar();

	public Optional<Usuarios> listarId(int id);

	public int save(Usuarios u);

	public void delete(int id);
}
