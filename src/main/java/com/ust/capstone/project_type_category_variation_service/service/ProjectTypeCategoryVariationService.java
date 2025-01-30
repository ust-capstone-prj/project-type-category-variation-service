package com.ust.capstone.project_type_category_variation_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.capstone.project_type_category_variation_service.dao.ProjectTypeCategoryVariationRepository;
import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjectTypeCategoryVariation;

@Service
public class ProjectTypeCategoryVariationService {

    @Autowired
    private ProjectTypeCategoryVariationRepository projRepo;

    public List<ProjectTypeCategoryVariation> getAllVariations() {
        return projRepo.findAll();
    }

    public ProjectTypeCategoryVariation getProjectVariation(Long id) {
        return projRepo.findById(id).orElse(null);
    }

    public ProjectTypeCategoryVariation getProjectVariationByCatogoryId(Long catId){
        return projRepo.findByProjTypCatId(catId);
    }
    public ProjectTypeCategoryVariation addProjectVariation(ProjectTypeCategoryVariation newVariation) {
        System.out.println(newVariation);
        return projRepo.saveAndFlush(newVariation);
    }

    public ProjectTypeCategoryVariation updateProjectVariation(ProjectTypeCategoryVariation updatedVariation) {
        return projRepo.save(updatedVariation);
    }

    public void deleteProjectVariation(Long id) {
        projRepo.deleteById(id);
    }

    
}
