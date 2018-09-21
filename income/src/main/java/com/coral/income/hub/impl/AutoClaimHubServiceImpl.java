package com.coral.income.hub.impl;

import com.coral.income.hub.AutoClaimVO;
import com.coral.income.hub.IAutoClaimServiceHub;

import java.util.List;

/**
 * Created by coral on 2018/9/20.
 */
public class AutoClaimHubServiceImpl implements IAutoClaimServiceHub {

    private final static Integer CHUNK_SIZE = 100;

    @Override
    public void executeAutoClaim(AutoClaimVO autoClaimVO) {
        List<String> productList = claimProductFilter(autoClaimVO);
        Long maxPolicyPageNo = claimPolicyPagedFilter(productList);

        for(int i=1;i<maxPolicyPageNo;i++) {
            List<String> policyList = findPolicyByPageNo(i);

            for(String policy : policyList) {
                if (AutoClaimVO.CHECK_BEFORE_CLAIM_NOTIFICATION.equals(autoClaimVO.getAutoclaimType())) {
                    boolean validResult = policyValidation(policy);
                    if (!validResult) continue;
                    else {
                        //callNotification
                        //callRegister
                        //callCloseClaim
                    }
                } else if (AutoClaimVO.CHECK_BEFORE_CLAIM_REGISTRATION.equals(autoClaimVO.getAutoclaimType())) {
                    // callNotification
                    boolean validResult = policyValidation(policy);
                    if (!validResult) continue;
                    else {
                        //callRegister
                        //callCloseClaim
                    }
                }
            }
        }

    }


    public List<String> claimProductFilter(AutoClaimVO autoClaimVO) {
        return null;
    }

    public Long claimPolicyPagedFilter(List<String> productList) {
        // query count by given product list

        Long filteredPolicyCount = 10l; //daoQueryPolicyByProductList
        return getMaxPolicyPageNo(filteredPolicyCount);
    }

    public Long getMaxPolicyPageNo(Long totalCount) {
        return (totalCount / CHUNK_SIZE) + 1;
    }

    public List<String> findPolicyByPageNo(Integer policyPageNo) {
        return null;
    }

    public boolean policyValidation(String policy) {
        return true;
    }

    public void customerNotify() {
        // send email to customer
    }


}
