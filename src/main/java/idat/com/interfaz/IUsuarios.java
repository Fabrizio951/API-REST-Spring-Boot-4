package idat.com.interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.com.modelo.Usuarios;

@Repository
public interface IUsuarios extends CrudRepository<Usuarios, Integer>{

}
