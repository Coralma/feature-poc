package com.poc.autoclaim.hub.model;

import com.google.common.collect.Lists;

import java.util.Date;
import java.util.List;

public class AutoClaimDTO {

    Long productCategory; //产品分类
    Date effectiveDate;
    List<ClaimFactorDTO> claimFactors = Lists.newArrayList();

    public Long getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<ClaimFactorDTO> getClaimFactors() {
        return claimFactors;
    }

    public void setClaimFactors(List<ClaimFactorDTO> claimFactors) {
        this.claimFactors = claimFactors;
    }
}
