package com.spase.spase.service;

import com.spase.spase.entity.Lord;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;

public interface LordService {

    Lord getById(long id);

    List<Lord> getAll();

    @Transactional
    List<Lord> getAll(String sortedBy, int limit);

    Lord createLord(Lord lord);

    void deleteById(Long id);

    void addPlanet(Long lordId, Long planetId);

    List<Lord> findLordsWithNumberOfPlanets(int count);

    List<Lord> getLordsSortByAndLimit(String sortBy, int limit);
}
