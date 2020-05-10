package com.yura.springlessons.service;

import com.yura.springlessons.model.Project;

import java.util.Optional;

public interface ProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
