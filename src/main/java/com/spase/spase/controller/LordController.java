package com.spase.spase.controller;

import com.spase.spase.entity.Lord;
import com.spase.spase.service.LordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/lords")
@Slf4j
@RequiredArgsConstructor
public class LordController {

    private final LordService lordService;

    @GetMapping
    public List<Lord> getAll() {
        return lordService.getAll();
    }

    @PostMapping
    public Lord create(@RequestBody Lord lord) {
        return lordService.createLord(lord);
    }

    @PostMapping("/{lordId}/add-planet/{planetId}")
    public void addPlanet(@PathVariable long lordId, @PathVariable long planetId) {
        lordService.addPlanet(lordId, planetId);
    }

    @GetMapping("/withPlanetsCount")//lords/withPlanetsCount?planetCount=0
    public List<Lord> findLordsWithNumberOfPlanets(@RequestParam int planetCount) {
        return lordService.findLordsWithNumberOfPlanets(planetCount);
    }

    @GetMapping("/topSorted")//lords/topSorted?sortBy=age&limit=10
    public List<Lord> getLordsSortByAndLimit(@RequestParam String sortBy, @RequestParam int limit) {
        return lordService.getAll(sortBy, limit);
    }
}
