package com.spase.spase.repository;

import com.spase.spase.entity.Lord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LordRepository extends JpaRepository<Lord, Long> {

    @Query(nativeQuery = true, value = "select l.* from lord l " +
            "left join planet p on l.id = p.lord_id " +
            "group by l.id having count(p.lord_id) = ?1")
    List<Lord> findLordsWithNumberOfPlanets(int count);

    @Query(nativeQuery = true, value = "select * from lord order by ?1 asc limit ?2")
    List<Lord> selectLordsSortByAndLimit(String sortBy, int limit);
}
