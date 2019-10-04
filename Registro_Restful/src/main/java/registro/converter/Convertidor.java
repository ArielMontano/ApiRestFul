package registro.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import registro.entity.Usuario;
import registro.model.UsuarioModelo;

@Component("convertidor")
public class Convertidor {
	
	public List<UsuarioModelo> convertirUsuarioLista(List<Usuario> usuarios){
		List<UsuarioModelo> mUsuario = new ArrayList<>();
		for(Usuario usu : usuarios) {
			mUsuario.add(new UsuarioModelo(usu));
		}
		return mUsuario;
	}
	
	public UsuarioModelo convertirUsuario(Usuario usuario){
		UsuarioModelo mUsuario = new UsuarioModelo(usuario);
		return mUsuario;
	}
}
