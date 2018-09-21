package com.coral.income.hub.impl;

import com.coral.income.hub.AutoClaimVO;
import com.coral.income.hub.IAutoClaimHub;

import java.util.List;

/**
 * Created by coral on 2018/9/20.
 */
public class AutoClaimHubImpl implements IAutoClaimHub {

    @Override
    public void executeAutoClaim(AutoClaimVO autoClaimVO) {
        List<String> productList = claimProductFilter(autoClaimVO);
        List<String> policyList = claimPolicyFilter(productList);

        for(String policy : policyList) {
            if(AutoClaimVO.CHECK_BEFORE_CLAIM_NOTIFICATION.equals(autoClaimVO.getAutoclaimType())) {
                boolean validResult = policyValidation(policy);
                if(!validResult) continue;
                else {
                    //callNotification
                    //callRegister
                    //callCloseClaim
                }
            } else if(AutoClaimVO.CHECK_BEFORE_CLAIM_REGISTRATION.equals(autoClaimVO.getAutoclaimType())) {
                // callNotification
                boolean validResult = policyValidation(policy);
                if(!validResult) continue;
                else {
                    //callRegister
                    //callCloseClaim
                }
            }
        }

    }


    public List<String> claimProductFilter(AutoClaimVO autoClaimVO) {
        return null;
    }

    public List<String> claimPolicyFilter(List<String> productList) {
        return null;
    }

    public boolean policyValidation(String policy) {
        return true;
    }

    public void customerNotify() {
        // send email to customer
    }


}
