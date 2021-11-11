package com.spase.spase.service;

import com.spase.spase.entity.Lord;
import com.spase.spase.entity.Planet;
import com.spase.spase.repository.LordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LordServiceImpl implements LordService {

    private final LordRepository lordRepository;
    private final PlanetService planetService;

    @Transactional
    @Override
    public Lord getById(long id) {
        return lordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lord not found with id" + id));
    }

    @Transactional
    @Override
    public List<Lord> getAll() {
        return (List<Lord>) lordRepository.findAll();
    }

    @Transactional
    @Override
    public List<Lord> getAll(String sortedBy, int limit) {
        Pageable pageable = PageRequest.of(0, limit, Sort.by(sortedBy));
        return lordRepository.findAll(pageable).toList();
    }

    @Transactional
    @Override
    public Lord createLord(Lord lord) {
        return lordRepository.save(lord);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        lordRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void addPlanet(Long lordId, Long planetId) {
        Lord lord = getById(lordId);
        Planet planet = planetService.getById(planetId);
        lord.getPlanets().add(planet);
        lordRepository.save(lord);
    }

    @Transactional
    @Override
    public List<Lord> findLordsWithNumberOfPlanets(int count) {
        return lordRepository.findLordsWithNumberOfPlanets(count);
    }

    @Transactional
    @Override
    public List<Lord> getLordsSortByAndLimit(String sortBy, int limit) {
        return lordRepository.selectLordsSortByAndLimit(sortBy, limit);
    }
}
