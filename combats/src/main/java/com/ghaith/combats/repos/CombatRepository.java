package com.ghaith.combats.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ghaith.combats.entities.Categorie;
import com.ghaith.combats.entities.Combat;

@RepositoryRestResource(path = "rest")
public interface CombatRepository extends JpaRepository<Combat, Long> {
	List<Combat> findByNomj1(String nom);

	List<Combat> findByNomj1Contains(String nom);

	/*
	 * @Query("select c from Combat c where c.nomj1 like %?1 and c.scorej1 > ?2")
	 * List<Combat> findByNomScore (String nom, Integer score);
	 */

	@Query("select c from Combat c where c.nomj1 like %:nom and c.scorej1 > :score")
	List<Combat> findByNomScore(@Param("nom") String nom, @Param("score") Integer score);

	@Query("select c from Combat c where c.categorie = ?1")
	List<Combat> findByCategorie(Categorie categorie);

	List<Combat> findByCategorieIdCat(Long id);

	List<Combat> findByOrderByIdCombatAsc();

	@Query("select m from Combat m order by m.nomj1 ASC, m.scorej1 DESC")
	List<Combat> trierCombatsNomsScore();

}
