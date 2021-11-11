package com.spase.spase.controller;

import com.spase.spase.entity.Planet;
import com.spase.spase.service.PlanetService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planets")
@RequiredArgsConstructor
public class PlanetController {

    private final PlanetService planetService;

    @PostMapping
    public Planet create(@RequestBody Planet planet) {
        return planetService.createPlanet(planet);
    }

    @DeleteMapping
    public void delete(@NonNull long id) {
        planetService.deleteById(id);
    }
}
