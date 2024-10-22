package com.ghaith.combats.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomj1", types = { Combat.class })
public interface CombatProjection {
	public String getNomj1();

}
