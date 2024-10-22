package com.ghaith.combats.service;

import java.util.List;

import com.ghaith.combats.entities.Categorie;
import com.ghaith.combats.entities.Combat;

public interface CombatService {
	Combat saveCombat(Combat c);

	Combat updateCombat(Combat c);

	void deleteCombat(Combat c);

	void deleteCombatById(Long id);

	Combat getCombat(Long id);

	List<Combat> getAllCombats();

	List<Combat> findByNomj1(String nom);

	List<Combat> findByNomj1Contains(String nom);

	List<Combat> findByNomScore(String nom, Integer prix);

	List<Combat> findByCategorie(Categorie categorie);

	List<Combat> findByCategorieIdCat(Long id);

	List<Combat> findByOrderByIdCombatAsc();

	List<Combat> trierCombatsNomsScore();

}
