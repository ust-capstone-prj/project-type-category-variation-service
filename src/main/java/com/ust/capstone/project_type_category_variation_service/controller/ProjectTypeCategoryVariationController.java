package com.ust.capstone.project_type_category_variation_service.controller;

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
import com.ust.capstone.project_type_category_variation_service.service.ProjectTypeCategoryVariationService;

@RestController
@RequestMapping("/api")
public class ProjectTypeCategoryVariationController {

    @Autowired
    public ProjectTypeCategoryVariationService projService;

    @GetMapping("/projectvar/{pid}")
    public ResponseEntity<ProjectTypeCategoryVariation> getProject(@PathVariable("pid") Long id) {
        return new ResponseEntity(projService.getProjectVariation(id), HttpStatus.OK);
    }

    @PostMapping("/projectvar")
    public ResponseEntity<ProjectTypeCategoryVariation> addProject(@RequestBody ProjectTypeCategoryVariation newProj) {
        return new ResponseEntity(projService.addProjectVariation(newProj), HttpStatus.OK);
    }

    @PutMapping("/projectvar")
    public ResponseEntity<ProjectTypeCategoryVariation> updateProject(
            @RequestBody ProjectTypeCategoryVariation updatedProj) {
        return new ResponseEntity(projService.updateProjectVariation(updatedProj), HttpStatus.OK);
    }

    @DeleteMapping("/projectvar/{pid}")
    public ResponseEntity<Void> deleteProject(@PathVariable("pid") Long id) {
        projService.deleteProjectVariation(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
