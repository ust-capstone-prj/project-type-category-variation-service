package com.ust.capstone.project_type_category_variation_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjectTypeCategoryVariation;

@Repository
public interface ProjectTypeCategoryVariationRepository extends JpaRepository<Long, ProjectTypeCategoryVariation> {

}
