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
    private Long ProjTypCatVarId;

    @Column(name = "variation_name")
    private String ProjTypCatVarName;

    @Column(name = "variation_basecost")
    private double ProjTypCatVarCost;

    @Column(name = "variation_img")
    private String ProjTypCatVarImg;

    @Column(name = "variation_desc")
    private String ProjTypCatVarDesc;

    @Column(name = "project_type_category_id")
    private Long ProjTypCatId;
}
