package com.ctrip.tour.testlink.dal.repository;

import com.ctrip.tour.testlink.dal.model.CrEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hbhu on 2018/8/30.
 */
@Repository
public interface CrRepository extends JpaRepository<CrEntity, Integer> {

    public CrEntity findByCrId(String crId);

    public List<CrEntity> findByFixVersionId(int version);

}
