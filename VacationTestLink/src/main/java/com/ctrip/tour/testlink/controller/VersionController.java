package com.ctrip.tour.testlink.controller;

import com.ctrip.tour.testlink.common.ServerResponse;
import com.ctrip.tour.testlink.dal.model.ProjectEntity;
import com.ctrip.tour.testlink.domain.version.VersionProvider;
import com.ctrip.tour.testlink.dto.AddProjectRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hbhu on 2018/9/3.
 */
@Controller
@RequestMapping("/version/")
public class VersionController {

    private static Logger logger = LoggerFactory.getLogger(VersionController.class);

    @Autowired
    private VersionProvider versionProvider;

    @ResponseBody
    @RequestMapping(value = "addProject", method = RequestMethod.POST)
    public ServerResponse addProject(@RequestBody AddProjectRequestDto requestDto) {

        try {
            versionProvider.addProject(requestDto);
            return ServerResponse.createBySuccess();
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return ServerResponse.createByErrorMessage(ex.getMessage());
        }

    }

    @ResponseBody
    @RequestMapping(value = "queryAllProjects",method = RequestMethod.GET)
    public ServerResponse<List<ProjectEntity>> queryProject(){
        try{
            List<ProjectEntity> projects = versionProvider.queryAllProjects();
            return ServerResponse.createBySuccess(projects);
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return ServerResponse.createByErrorMessage(ex.getMessage());
        }
    }

}
