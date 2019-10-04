package registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import registro.converter.Convertidor;
import registro.entity.Usuario;
import registro.model.UsuarioModelo;
import registro.repository.UsuarioRepositorio;

@Service("servicio")
public class UsuarioService {
	@Autowired
	UsuarioRepositorio usuarioRepo;
	
	@Autowired
	Convertidor convertidor;
	
	public UsuarioModelo crearUsuario(Usuario usuario) {
		try {
			List<UsuarioModelo> usuarios = this.buscaEmail(usuario.getEmail());
			System.out.println("Lista " + usuarios);
			if(!usuarios.isEmpty()) {
				System.out.println("usuario encontrado " + usuarios);
				return null;
			}
			else {
				//System.out.println("else " + usuario);
				usuarioRepo.save(usuario);
			}
			return convertidor.convertirUsuario(usuario);
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public UsuarioModelo obtenerUsuarioByName(String name) {
		try {
			return convertidor.convertirUsuario(usuarioRepo.findByName(name));
		}catch(Exception e) {
			return null;
		}
	}
	
	public UsuarioModelo obtenerUsuario(Long idUsuario) {
		try {
			return convertidor.convertirUsuario(usuarioRepo.findByIdUsuario(idUsuario));
		}catch(Exception e) {
			return null;
		}
	}
	
	public List<UsuarioModelo> buscaEmail(String email){
		try {
			List<UsuarioModelo> usuarios = convertidor.convertirUsuarioLista(usuarioRepo.findByEmail(email));
			if(!usuarios.isEmpty())
				return usuarios;
			return null;
		}
		catch(Exception e) {
			return null;
		}
	}
}
