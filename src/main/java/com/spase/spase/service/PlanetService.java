package com.spase.spase.service;

import com.spase.spase.entity.Planet;

public interface PlanetService {

    Planet createPlanet(Planet planet);

    void deleteById(long id);

    Planet getById(Long id);
}
