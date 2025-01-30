package com.ust.capstone.project_type_category_variation_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjectTypeCategoryVariation;
import com.ust.capstone.project_type_category_variation_service.pojo.VariationAndCostPojo;
import com.ust.capstone.project_type_category_variation_service.service.ProjectTypeCategoryVariationService;

@RestController
@RequestMapping("/api")
public class ProjectTypeCategoryVariationController {

    @Autowired
    public ProjectTypeCategoryVariationService projService;

    @GetMapping("/projectvar")
    public ResponseEntity<List<ProjectTypeCategoryVariation>> getAllProjects() {
        return new ResponseEntity<List<ProjectTypeCategoryVariation>>(projService.getAllVariations(), HttpStatus.OK);
    }

    @GetMapping("/projectvar/{pid}")
    public ResponseEntity<ProjectTypeCategoryVariation> getProject(@PathVariable("pid") Long id) {
        return new ResponseEntity<ProjectTypeCategoryVariation>(projService.getProjectVariation(id), HttpStatus.OK);
    }

    @GetMapping("/projectvar/category/{projectCategoryId}")
    public ResponseEntity<List<ProjectTypeCategoryVariation>> getProjectVariationByCategoryId(@PathVariable("projectCategoryId") Long catId){
        return new ResponseEntity<List<ProjectTypeCategoryVariation>>(projService.getProjectVariationByCatogoryId(catId),HttpStatus.OK);
    }

    @PostMapping("/projectvar")
    public ResponseEntity<ProjectTypeCategoryVariation> addProject(@RequestBody ProjectTypeCategoryVariation newProj) {
        return new ResponseEntity<ProjectTypeCategoryVariation>(projService.addProjectVariation(newProj), HttpStatus.OK);
    }

    @PutMapping("/projectvar")
    public ResponseEntity<ProjectTypeCategoryVariation> updateProject(
            @RequestBody ProjectTypeCategoryVariation updatedProj) {
        return new ResponseEntity<ProjectTypeCategoryVariation>(projService.updateProjectVariation(updatedProj), HttpStatus.OK);
    }

    @DeleteMapping("/projectvar/{pid}")
    public ResponseEntity<Void> deleteProject(@PathVariable("pid") Long id) {
        projService.deleteProjectVariation(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/projectvar/costs/{projectCategoryId}")
    public ResponseEntity<VariationAndCostPojo> getProjectCostByVarId(@PathVariable("projectCategoryId") Long catId){
        return new ResponseEntity<VariationAndCostPojo>(projService.getProjectCostByVarId(catId),HttpStatus.OK);
    }
}
