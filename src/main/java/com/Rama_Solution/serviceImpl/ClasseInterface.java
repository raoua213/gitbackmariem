package com.Rama_Solution.serviceImpl;

import java.util.List;
import com.Rama_Solution.backend_pfe.entities.Classe;

public interface ClasseInterface {
	Classe addClasse(Classe c);
	Classe updateClasse(Classe c);
	void deleteCalsseByID(Long id);
	List<Classe> findAllClasses();
}
