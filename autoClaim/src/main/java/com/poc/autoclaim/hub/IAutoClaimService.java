package com.poc.autoclaim.hub;

import com.poc.autoclaim.hub.model.AutoClaimDTO;

public interface IAutoClaimService {

    void executeAutoClaim(AutoClaimDTO autoClaimVO);

}
