package registro.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import registro.entity.Usuario;

@Repository("usuarioRepo")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Serializable>{
	public abstract Usuario findByIdUsuario(Long id);
	public abstract Usuario findByName(String name);
	public abstract List<Usuario> findByEmail(String email);
}
