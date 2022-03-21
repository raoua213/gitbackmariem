package com.Rama_Solution.backend_pfe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Rama_Solution.backend_pfe.entities.Classe;
import com.Rama_Solution.backend_pfe.repos.ClasseRepository;



@SpringBootTest
class BackendPfeApplicationTests {
	@Autowired
	private ClasseRepository classeRepository;
	@Test
	public void testCreateClasse() {
		Classe clas = new Classe("vert");
		classeRepository.save(clas);
	}

}




