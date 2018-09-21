package com.coral.income.trigger.impl;

import com.coral.income.hub.AutoClaimVO;
import com.coral.income.trigger.IAutoClaimTrigger;

/**
 * Created by coral on 2018/9/20.
 */
public class WeatherAutoClaimTrigger implements IAutoClaimTrigger {


    @Override
    public void trigger() {
        AutoClaimVO autoClaimVO = new AutoClaimVO();
        autoClaimVO.setProductCategory(1l);
        autoClaimVO.setAutoclaimType(AutoClaimVO.CHECK_BEFORE_CLAIM_NOTIFICATION);


    }
}
