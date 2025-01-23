package com.ust.capstone.project_type_category_variation_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.project_type_category_variation_service.dao.ProjectTypeCategoryVariationRepository;

@RestController
@RequestMapping("/api")
public class ProjectTypeCategoryVariationService {

    @Autowired
    private ProjectTypeCategoryVariationRepository projRepo;

}
