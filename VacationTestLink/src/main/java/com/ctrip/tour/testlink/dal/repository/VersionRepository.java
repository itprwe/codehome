package com.ctrip.tour.testlink.dal.repository;

import com.ctrip.tour.testlink.dal.model.VersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hbhu on 2018/8/31.
 */
@Repository
public interface VersionRepository extends JpaRepository<VersionEntity,Integer> {
}
