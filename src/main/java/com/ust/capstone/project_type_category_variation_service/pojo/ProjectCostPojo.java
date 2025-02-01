package com.ust.capstone.project_type_category_variation_service.pojo;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCostPojo {

    // private Long ProjTypCatCostBreakdown_id;
    private Long projTypCatVarId;
    private double profitCost;
    private double labourCost;
    private double materialCost;

    // // mapping
    // @OneToOne
    // @JoinColumn(name = "project_type_category_verification_id")
    // private String ProjTypCatVar_name;

}
