package registro.model;

import registro.entity.Usuario;

public class UsuarioModelo {
	private Long idUsuario;
	private String name;
	private String email;
	private String pasword;
	
	public UsuarioModelo(Usuario usu) {
		this.idUsuario = usu.getIdUsuario();
		this.name = usu.getName();
		this.email = usu.getEmail();
		this.pasword = usu.getPasword();
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
}
