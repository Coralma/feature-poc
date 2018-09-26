package com.poc.autoclaim.trigger.impl;

import com.poc.autoclaim.hub.model.AutoClaimDTO;
import com.poc.autoclaim.trigger.IAutoClaimTrigger;

/**
 * Created by coral on 2018/9/20.
 */
public class WeatherAutoClaimTrigger implements IAutoClaimTrigger {


    @Override
    public void trigger() {
        AutoClaimDTO autoClaimVO = new AutoClaimDTO();
        autoClaimVO.setProductCategory(1l);
        autoClaimVO.setAutoclaimType(AutoClaimDTO.CHECK_BEFORE_CLAIM_NOTIFICATION);


    }
}
