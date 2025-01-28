package com.ust.capstone.project_type_category_variation_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.project_type_category_variation_service.dao.ProjectTypeCategoryVariationRepository;
import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjectTypeCategoryVariation;
//import com.ust.capstone.project_type_category_variation_service.pojo.ProjectCostPojo;
import com.ust.capstone.project_type_category_variation_service.pojo.ProjectCostPojo;

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

    public ProjectTypeCategoryVariation addProjectVariation(ProjectTypeCategoryVariation newVariation) {
        return projRepo.saveAndFlush(newVariation);
    }

    public ProjectTypeCategoryVariation updateProjectVariation(ProjectTypeCategoryVariation updatedVariation) {
        return projRepo.save(updatedVariation);
    }

    public void deleteProjectVariation(Long id) {
        projRepo.deleteById(id);
    }

    public ProjectTypeCategoryVariation addProjectVariationWithCost(ProjectTypeCategoryVariation newVariation) {

        projRepo.saveAndFlush(newVariation);
        // input will be the body send by the frontend
        // double materialCost = input.getBaseCost() * input.getMaterialPercentage() /
        // 100;
        // double labourCost = input.getBaseCost() * input.getLabourPercentage() / 100;
        // double profitCost = input.getBaseCost() - (materialCost + labourCost);
        // ProjectCostPojo projectCost = new
        // ProjectCostPojo(newVariation.getProjTypCatVarId(), profitCost, labourCost,
        // materialCost)
        return projRepo.saveAndFlush(newVariation);
    }

}
