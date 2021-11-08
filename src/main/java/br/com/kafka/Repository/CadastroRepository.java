package br.com.kafka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kafka.Model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

}
