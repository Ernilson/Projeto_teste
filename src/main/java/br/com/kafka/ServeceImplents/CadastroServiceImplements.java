package br.com.kafka.ServeceImplents;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kafka.Model.Cadastro;
import br.com.kafka.Repository.CadastroRepository;
import br.com.kafka.Servece.CadastroService;

@Service
public class CadastroServiceImplements implements CadastroService{

	@Autowired
	private CadastroRepository rp;
	
	//Metodo para Salvar ou Alterar Cadastro
	@Override
	public Cadastro salveOrUpdate(Cadastro c) {		
		return rp.save(c);
	}

	//Metodo para excluir por Id
	@Override
	public void delete(Long id) {
		rp.deleteById(id);		
	}

	//Metodo listar todos os cadastros
	@Override
	public List<Cadastro> listAll() {		
		return rp.findAll();
	}	
			
	//Metodo para buscar por Id
	public Optional<Cadastro> buscaPorId(Long id){		
		return rp.findById(id);
	}

}
