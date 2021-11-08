package br.com.kafka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kafka.Model.Cadastro;
import br.com.kafka.ServeceImplents.CadastroServiceImplements;

@RestController
public class CadastroController {

	@Autowired
	private CadastroServiceImplements csi;
	
	@GetMapping("/cadastro")
	public List<Cadastro> listALL(){		
		return csi.listAll();
	}	
	
	@PostMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity savaOrUpdateCadastro(@RequestBody Cadastro c) {		
		csi.salveOrUpdate(c);		
		//return ResponseEntity.ok("OK");
		throw new NullPointerException();
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable Long id) {
		csi.delete(id);
	}
	
	
}
