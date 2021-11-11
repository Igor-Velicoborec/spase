package com.spase.spase.service;

import com.spase.spase.entity.Planet;
import com.spase.spase.repository.PlanetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanetServiceImpl implements PlanetService {

    private final PlanetRepository planetRepository;

    @Override
    public Planet createPlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    @Override
    public void deleteById(long id) {
        planetRepository.deleteById(id);

    }

    @Override
    public Planet getById(Long id) {
        return planetRepository.
                findById(id).orElseThrow(() -> new RuntimeException("Planets not found with id " + id));
    }
}
