//package br.com.kafka;
//
//import org.hamcrest.Matchers;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import br.com.kafka.Controller.CadastroController;
//import br.com.kafka.Model.Cadastro;
//
//
//public class CadastroControllerTest extends ProjetoTesteApplicationTests {
//
//	
//private MockMvc mockMvc;
//	
//	@Autowired
//	private CadastroController cadastroController;
//	
//	@Before
//	public void setUp() {
//		this.mockMvc = MockMvcBuilders.standaloneSetup(cadastroController).build();
//	}
//	
//	@Test
//	public void criarCadastro_RetornaStatusCode201() throws Exception {
//		Cadastro cad = new Cadastro();
//		cad.setNome("teste1");
//		cad.setEndereco("testeaqui");
//		cad.setTelefone("1234567");
//		
//		ObjectMapper mapper = new ObjectMapper();
//		
//		String json = mapper.writeValueAsString(cad);
//		
//		this.mockMvc.perform(MockMvcRequestBuilders.post("/cad")
//				.contentType(MediaType.APPLICATION_JSON)
//				.contentType(json)
//				)
//				.andExpect(MockMvcResultMatchers.status().isCreated())
//				.andExpect(MockMvcResultMatchers.header().string("location", Matchers.containsString("http://localhost/cad")));
//	
//	}
//}
