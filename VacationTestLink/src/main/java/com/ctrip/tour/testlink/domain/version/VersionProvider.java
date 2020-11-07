package com.ctrip.tour.testlink.domain.version;

import com.ctrip.tour.testlink.dal.model.ProjectEntity;
import com.ctrip.tour.testlink.dal.repository.ProjectRepository;
import com.ctrip.tour.testlink.dto.AddProjectRequestDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;

/**
 * Created by hbhu on 2018/9/3.
 */
@Component
public class VersionProvider {

    @Autowired
    private ProjectRepository projectRepository;

    public void syncCrForVersion(int versionId) {
        // TODO: 2018/9/3
    }

    public void syncVersionFroProj(int projId) {
        // TODO: 2018/9/3
    }

    public void addProject(AddProjectRequestDto requestDto) {

        ProjectEntity projectEntity = new ProjectEntity();
        BeanUtils.copyProperties(requestDto,projectEntity);
        projectRepository.saveAndFlush(projectEntity);

    }

    public List<ProjectEntity> queryAllProjects(){
        return projectRepository.findAll();
    }
}
