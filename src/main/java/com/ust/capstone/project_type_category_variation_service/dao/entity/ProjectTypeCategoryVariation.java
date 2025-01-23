package com.ust.capstone.project_type_category_variation_service.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectTypeCategoryVariation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_type_category_variation_id")
    private Long ProjTypCatVar_id;

    @Column(name = "project_type_category_variation_name")
    private String ProjTypCatVar_name;

    @Column(name = "project_type_category_variation_base_cost")
    private float ProjTypCatVar_cost;

    @Column(name = "project_type_category_variation_img")
    private String ProjTypCatVar_img;

    @Column(name = "project_type_category_variation_desc")
    private String ProjTypCatVar_desc;

    @Column(name = "project_type_category_Id")
    private Long ProjTypCat_id;
}
