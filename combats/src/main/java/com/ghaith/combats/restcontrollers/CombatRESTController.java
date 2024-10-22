package com.ghaith.combats.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ghaith.combats.entities.Combat;
import com.ghaith.combats.service.CombatService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CombatRESTController {
	@Autowired
	CombatService combatService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Combat> getAllCombats() {
		return combatService.getAllCombats();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Combat getCombatById(@PathVariable("id") Long id) {
		return combatService.getCombat(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Combat createProduit(@RequestBody Combat combat) {
		return combatService.saveCombat(combat);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Combat updateCombat(@RequestBody Combat c) {
		return combatService.updateCombat(c);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCombat(@PathVariable("id") Long id) {
		combatService.deleteCombatById(id);
	}

	@RequestMapping(value = "/combscat/{idCat}", method = RequestMethod.GET)
	public List<Combat> getCombatsByCatId(@PathVariable("idCat") Long idCat) {
		return combatService.findByCategorieIdCat(idCat);
	}
}
