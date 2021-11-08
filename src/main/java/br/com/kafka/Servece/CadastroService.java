package br.com.kafka.Servece;

import java.util.List;
import java.util.Optional;

import br.com.kafka.Model.Cadastro;

public interface CadastroService {
	
	//Metodo para Salvar ou Alterar
	Cadastro salveOrUpdate(Cadastro c);

	//Metodo para Deletar pelo Id
	void delete(Long id);

	//Metodo para Listar todos os cadastros
	List<Cadastro> listAll();
	
	//Metodo para buscar por Id
	Optional<Cadastro> buscaPorId(Long id);
}