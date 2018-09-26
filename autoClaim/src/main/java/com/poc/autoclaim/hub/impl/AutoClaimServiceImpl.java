package com.poc.autoclaim.hub.impl;

import com.poc.autoclaim.hub.model.AutoClaimDTO;
import com.poc.autoclaim.hub.IAutoClaimService;

import java.util.List;

/**
 * Created by coral on 2018/9/20.
 */
public class AutoClaimServiceImpl implements IAutoClaimService {

    @Override
    public void executeAutoClaim(AutoClaimDTO autoClaimVO) {
        List<String> productList = claimProductFilter(autoClaimVO);
        List<String> policyList = claimPolicyFilter(productList);

        for(String policy : policyList) {
            /*if(AutoClaimVO.CHECK_BEFORE_CLAIM_NOTIFICATION.equals(autoClaimVO.getAutoclaimType())) {
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
            }*/
        }

    }

    public List<String> claimProductFilter(AutoClaimDTO autoClaimVO) {
        // call product model and run the X-Decision validation
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
