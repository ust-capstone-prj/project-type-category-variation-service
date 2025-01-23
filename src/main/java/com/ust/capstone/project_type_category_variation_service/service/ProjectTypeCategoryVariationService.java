package com.ust.capstone.project_type_category_variation_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.project_type_category_variation_service.dao.ProjectTypeCategoryVariationRepository;
import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjectTypeCategoryVariation;

@RestController
@RequestMapping("/api")
public class ProjectTypeCategoryVariationService {

    @Autowired
    private ProjectTypeCategoryVariationRepository projRepo;

    public ProjectTypeCategoryVariation getProjectVariation(Long id) {
        return projRepo.findById(id).orElse(null);
    }

    public ProjectTypeCategoryVariation addProjectVariation(ProjectTypeCategoryVariation newVariation) {
        return projRepo.saveAndFlush(newVariation);
    }

    public ProjectTypeCategoryVariation updateProjectVariation(ProjectTypeCategoryVariation updatedVariation) {
        return projRepo.save(updatedVariation);
    }

    public void deleteProjectVariation(Long id) {
        projRepo.deleteById(id);
    }

}
