package com.ghaith.combats;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghaith.combats.entities.Categorie;
import com.ghaith.combats.entities.Combat;
import com.ghaith.combats.repos.CombatRepository;

@SpringBootTest
class CombatsApplicationTests {
	@Autowired
	private CombatRepository combatRepository;

	@Test
	public void testCreateCombat() {
		Combat comb = new Combat("b", "b1", 30, 29, new Date());
		combatRepository.save(comb);
	}

	@Test
	public void testFindCombat() {
		Combat c = combatRepository.findById(1L).get();
		System.out.println(c);
	}

	@Test
	public void testUpdateCombat() {
		Combat c = combatRepository.findById(1L).get();
		c.setScorej1(29);
		combatRepository.save(c);
		System.out.println(c);
	}

	@Test
	public void testDeleteCombat() {
		combatRepository.deleteById(1L);
	}

	@Test
	public void testFindAllCombat() {
		List<Combat> combs = combatRepository.findAll();
		for (Combat c : combs)
			System.out.println(c);
	}

	@Test
	public void testFindCombatByNom() {
		List<Combat> combs = combatRepository.findByNomj1("j4");
		for (Combat c : combs)
			System.out.println(c);
	}

	@Test
	public void testFindCombatByNomContains() {
		List<Combat> combs = combatRepository.findByNomj1Contains("j3");
		for (Combat c : combs)
			System.out.println(c);
	}

	@Test
	public void testfindByNomScore() {
		List<Combat> combs = combatRepository.findByNomScore("j3", 26);
		for (Combat c : combs) {
			System.out.println(c);
		}
	}

	@Test
	public void testfindByCategorie() {
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Combat> combs = combatRepository.findByCategorie(cat);
		for (Combat c : combs)
			System.out.println(c);
	}

	@Test
	public void findByCategorieIdCat() {
		List<Combat> combs = combatRepository.findByCategorieIdCat(1L);
		for (Combat c : combs) {
			System.out.println(c);
		}
	}

	@Test
	public void testfindByOrderByIdCombatAsc() {
		List<Combat> combs = combatRepository.findByOrderByIdCombatAsc();
		for (Combat c : combs) {
			System.out.println(c);
		}
	}

	@Test
	public void testTrierCombatsNomj1Score() {
		List<Combat> combs = combatRepository.trierCombatsNomsScore();

		for (Combat m : combs) {
			System.out.println(m);
		}
	}

}
