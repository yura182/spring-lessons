package com.yura.springlessons.repository.impl;

import com.yura.springlessons.model.Project;
import com.yura.springlessons.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProjectRepositoryImpl implements ProjectRepository {

    private List<Project> projects = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream().filter(p-> p.getId().equals(id)).findFirst();
    }

    @Override
    public Project save(Project project) {
        Project existingProject = findById(project.getId()).orElse(null);

        if (Objects.isNull(existingProject)) {
            projects.add(project);
            return project;
        } else {
            Project newProject = new Project(project);

            projects.remove(existingProject);
            projects.add(project);

            return newProject;
        }
    }
}
