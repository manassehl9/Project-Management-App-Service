package io.maieapp.ppmtool.services;

import io.maieapp.ppmtool.domain.ProjectTask;
import io.maieapp.ppmtool.repositories.BacklogRepository;
import io.maieapp.ppmtool.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

//    public ProjectTask addProjectTask(){
//
//    }
}

