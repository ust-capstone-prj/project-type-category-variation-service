package com.ust.capstone.project_type_category_variation_service.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectCostPojo {

    // private Long ProjTypCatCostBreakdown_id;
    private Long ProjTypCatVarId;
    private double ProfitCost;
    private double LabourCost;
    private double MaterialCost;

    // // mapping
    // @OneToOne
    // @JoinColumn(name = "project_type_category_verification_id")
    // private String ProjTypCatVar_name;

}
