package com.ust.capstone.project_type_category_variation_service.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_type_category_variation")
public class ProjectTypeCategoryVariation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "variation_id")
    private Long projTypCatVarId;

    @Column(name = "variation_name")
    private String projTypCatVarName;

    @Column(name = "variation_basecost")
    private double projTypCatVarCost;

    @Column(name = "variation_img")
    private String projTypCatVarImg;

    @Column(name = "variation_desc")
    private String projTypCatVarDesc;

    @Column(name = "project_type_category_id")
    private Long projTypCatId;
}
