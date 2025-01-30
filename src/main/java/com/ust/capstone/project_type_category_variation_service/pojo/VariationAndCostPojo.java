package com.ust.capstone.project_type_category_variation_service.pojo;

// import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VariationAndCostPojo {
    
    private Long projTypCatVarId;
    
    private String projTypCatVarName;
   
    private double projTypCatVarCost;

    private String projTypCatVarImg;

    private String projTypCatVarDesc;

    private ProjectCostPojo projectCostPojo;
    // private Long projTypCatId;

}
