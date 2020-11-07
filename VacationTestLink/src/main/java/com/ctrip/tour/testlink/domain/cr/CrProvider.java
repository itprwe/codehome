package com.ctrip.tour.testlink.domain.cr;

import com.ctrip.tour.testlink.dal.model.CrEntity;
import com.ctrip.tour.testlink.dal.repository.CrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hbhu on 2018/9/3.
 */
@Component
public class CrProvider {

    @Autowired
    public CrRepository crRepository;

    public CrEntity queryByCrId(String crId) {
        return crRepository.findByCrId(crId);
    }

    public List<CrEntity> queryByVersion(int versionId) {
        return crRepository.findByFixVersionId(versionId);
    }

}
