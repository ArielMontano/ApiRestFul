package registro.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import registro.model.UsuarioModelo;

@Table(name="USUARIO")
@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	@Column(name="id_usuario")
	private Long idUsuario;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="pasword")
	private String pasword;
	
	public Usuario() {
		
	}
	
	public Usuario(UsuarioModelo usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.name = usuario.getName();
		this.email = usuario.getEmail();
		this.pasword = usuario.getPasword();
	}
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", name=" + name + ", email=" + email + ", pasword=" + pasword + "]";
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
