package com.yura.springlessons.repository;

import com.yura.springlessons.model.Project;

import java.util.Optional;

public interface ProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
