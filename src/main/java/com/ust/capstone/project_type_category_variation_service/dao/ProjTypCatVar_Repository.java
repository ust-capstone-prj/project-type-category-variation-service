package com.ust.capstone.project_type_category_variation_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.capstone.project_type_category_variation_service.dao.entity.ProjTypCatVar;

@Repository
public interface ProjTypCatVar_Repository extends JpaRepository<Long, ProjTypCatVar> {

}
