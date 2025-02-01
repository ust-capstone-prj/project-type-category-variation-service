package com.ust.capstone.project_type_category_variation_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.capstone.project_type_category_variation_service.dao.ProjectTypeCategoryVariationRepository;
import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjectTypeCategoryVariation;
import com.ust.capstone.project_type_category_variation_service.pojo.ProjectCostPojo;
import com.ust.capstone.project_type_category_variation_service.pojo.VariationAndCostPojo;

@Service
public class ProjectTypeCategoryVariationService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ProjectTypeCategoryVariationRepository projRepo;

    public List<ProjectTypeCategoryVariation> getAllVariations() {
        return projRepo.findAll();
    }

    public ProjectTypeCategoryVariation getProjectVariation(Long id) {
        return projRepo.findById(id).orElse(null);
    }

    public List<ProjectTypeCategoryVariation> getProjectVariationByCatogoryId(Long catId) {
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

    public VariationAndCostPojo getProjectCostByVarId(Long id) {
        ProjectTypeCategoryVariation variation = projRepo.findById(id).orElse(null);
        ProjectCostPojo costPojo = restTemplate.getForObject("http://localhost:1515/api/projectcosts/variation/" + id,
                ProjectCostPojo.class);
        // private Long projTypCatVarId;
        // private String projTypCatVarName;
        // private double projTypCatVarCost;
        // private String projTypCatVarImg;
        // private String projTypCatVarDesc;
        // private ProjectCostPojo projectCostPojo;
        VariationAndCostPojo variationAndCostPojo = new VariationAndCostPojo(
                variation.getProjTypCatVarId(),
                variation.getProjTypCatVarName(),
                variation.getProjTypCatVarCost(),
                variation.getProjTypCatVarImg(),
                variation.getProjTypCatVarDesc(),
                costPojo);
        System.out.println(variationAndCostPojo);
        return variationAndCostPojo;
    }

    public List<VariationAndCostPojo> getProjectsByCategoryId(Long projTypCatId) {
        List<ProjectTypeCategoryVariation> variations = projRepo.findByProjTypCatId(projTypCatId);

        return variations.stream().map(variation -> {
            ProjectCostPojo costPojo = restTemplate.getForObject(
                    "http://localhost:1515/api/projectcosts/variation/" + variation.getProjTypCatVarId(),
                    ProjectCostPojo.class);
            System.out.println("\n\n\nProjectCostPojo: " + costPojo);
            return new VariationAndCostPojo(
                    variation.getProjTypCatVarId(),
                    variation.getProjTypCatVarName(),
                    variation.getProjTypCatVarCost(),
                    variation.getProjTypCatVarImg(),
                    variation.getProjTypCatVarDesc(),
                    costPojo);
        }).collect(Collectors.toList());
    }

}
