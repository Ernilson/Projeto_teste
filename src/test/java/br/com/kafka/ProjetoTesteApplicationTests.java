package br.com.kafka;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.kafka.Model.Cadastro;
import br.com.kafka.Repository.CadastroRepository;
import br.com.kafka.ServeceImplents.CadastroServiceImplements;

@SpringBootTest
class ProjetoTesteApplicationTests {
	
	@Autowired
	private CadastroRepository cadRep;
	
	@Autowired
	private CadastroServiceImplements csi;
	
//	@Test
//	void salvaCadastro() {
//		Cadastro cad = new Cadastro();
//		Long ids = 18L;
//		cad.setId(ids);
//		cad.setNome("funcionou");
//		cad.setEndereco("teste0");
//		cad.setTelefone("00001");
//		
//		cadRep.save(cad);
//		
//	}
	
//	@Test
//	void alteraCadastro() {
//		Cadastro cad = new Cadastro();		
//		cad.setId(18L);
//		cad.setNome("funcionou");
//		cad.setEndereco("teste0");
//		cad.setTelefone("00001");
//		//		
//		csi.salveOrUpdate(cad);
//	}
	
	//Metodo para Listar todos do cadastro
//   @Test
//   public void listar () {	   
//       List <Cadastro> cad = csi.listAll();
//       System.out.println ("Total de Registros" + cad.size ());
//       for (Cadastro c: cad) {
//           System.out.println (c.getEndereco() + "-" + c.getNome());
//       }       
//   }
   
   //Metodo para Bucar por id
//   @Test
//   public void buscar () {
//       Long t= 10L;
//       Optional<Cadastro> p = csi.buscaPorId(t);
//        System.out.println (p.get().getNome() + "-" + p.get().getEndereco() + "-" + p.get().getTelefone());
//   }
       
     //Metodo para Excluir
//   @Test
//   public void excluir () {    
//     Long id = 9L; 
//       csi.delete(id);;
//   }
       
     //Metodo para Editar
//   @Test
//   public void Editar () {  
//	   Cadastro p = new Cadastro();   
//       Long longo = 2L;
//       p.setId(longo);
//       p.setNome("funcionou");;
//       p.setEndereco("outro");
//       p.setTelefone("741852963*");;
//       csi.salveOrUpdate(p);
// }

}
