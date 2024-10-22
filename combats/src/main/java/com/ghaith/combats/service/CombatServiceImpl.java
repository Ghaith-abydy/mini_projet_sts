package com.ghaith.combats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.combats.entities.Categorie;
import com.ghaith.combats.entities.Combat;
import com.ghaith.combats.repos.CombatRepository;

@Service
public class CombatServiceImpl implements CombatService {
	@Autowired
	CombatRepository combatRepository;

	@Override
	public Combat saveCombat(Combat c) {
		return combatRepository.save(c);
	}

	@Override
	public Combat updateCombat(Combat c) {
		return combatRepository.save(c);
	}

	@Override
	public void deleteCombat(Combat c) {
		combatRepository.delete(c);

	}

	@Override
	public void deleteCombatById(Long id) {
		combatRepository.deleteById(id);

	}

	@Override
	public Combat getCombat(Long id) {
		return combatRepository.findById(id).get();
	}

	@Override
	public List<Combat> getAllCombats() {
		return combatRepository.findAll();
	}

	@Override
	public List<Combat> findByNomj1(String nom) {
		return combatRepository.findByNomj1(nom);
	}

	@Override
	public List<Combat> findByNomj1Contains(String nom) {
		return combatRepository.findByNomj1Contains(nom);
	}

	@Override
	public List<Combat> findByNomScore(String nom, Integer prix) {
		return combatRepository.findByNomScore(nom, prix);
	}

	@Override
	public List<Combat> findByCategorie(Categorie categorie) {
		return combatRepository.findByCategorie(categorie);
	}

	@Override
	public List<Combat> findByCategorieIdCat(Long id) {
		return combatRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Combat> findByOrderByIdCombatAsc() {
		return combatRepository.findByOrderByIdCombatAsc();
	}

	@Override
	public List<Combat> trierCombatsNomsScore() {
		return combatRepository.trierCombatsNomsScore();
	}

}
