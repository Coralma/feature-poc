package com.coral.income.hub;

import lombok.Data;

@Data
public class AutoClaimVO {


    public static String CHECK_BEFORE_CLAIM_NOTIFICATION = "1";
    public static String CHECK_BEFORE_CLAIM_REGISTRATION = "2";

    Long productCategory; //产品分类
    String autoclaimType;



}
