package com.qunar.qchat.model;

import lombok.Data;

@Data
public class UserInfoOaReturn {
    private String userId;
    private String userName;
    private String department;
    private String TL;  //发起人的直属
    private String hrbp; //发起人的hrbp
    private String depVP;//发起人的部门
    private String hrd="";  //发起人的hrd 人力总监
    private String userRole; //用户角色




}
