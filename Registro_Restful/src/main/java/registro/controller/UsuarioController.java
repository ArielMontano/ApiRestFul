package registro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import registro.entity.Usuario;
import registro.model.UsuarioModelo;
import registro.service.UsuarioService;

@RestController
@RequestMapping("/v1")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping(value="/obtener/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean obtener(@PathVariable("idUsuario") Long idUsuario){

		return false;
	}
	
	@GetMapping(value="/obtenerUsuario/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> obtenerUsuario(@PathVariable("idUsuario") Long idUsuario){

		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping(value="/crearUsuario")
	public ResponseEntity<?> crearUsuario(@RequestBody @Valid Usuario usuario) {
		try {
			//System.out.println("crearUsuario " + usuario);
			UsuarioModelo mUsuario = usuarioService.crearUsuario(usuario);
			//System.out.println("retorno " + mUsuario);
			if(null != mUsuario)
				return new ResponseEntity<>(mUsuario, HttpStatus.OK);
			
			return new ResponseEntity<>("El correo ya registrado", HttpStatus.NOT_FOUND);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}	
		
	}
	
//	@ApiOperation(value="Crea auditoria",
//		notes="Crea una nueva auditoria",
//		response=Auditoria.class,
//		produces=MediaType.APPLICATION_JSON_VALUE
//	)
//	@ApiResponses({
//		@ApiResponse(code = 200, message = "Auditoria creada correctamente", response = Auditoria.class),
//		@ApiResponse(code = 409, message = "Error controlado en aplicacion", response = HttpStatus.class)
//	})
//	@PostMapping(value="V1/auditoria", produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<?> crearAuditoria(@RequestBody Auditoria auditoria){
//		try {
//			auditoriaService.guardarAuditoria(auditoria);
//			return new ResponseEntity<>(auditoria, HttpStatus.OK);
//		}
//		catch (Exception e) {
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
//		}		
//	}
}
