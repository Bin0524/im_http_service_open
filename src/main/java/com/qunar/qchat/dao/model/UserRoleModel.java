package com.qunar.qchat.dao.model;

import com.google.common.base.Strings;
import lombok.Data;

@Data
public class UserRoleModel {
    private Integer id;
    private String roleName; //角色名
    private Integer classId; //所属组别的ID
    private Integer availableFlag; //可用标志位 1可用，0不可用
    private String className; //所属角色组组名


    public static boolean checkDataFormat(UserRoleModel userRoleModel) {
        return !(Strings.isNullOrEmpty(userRoleModel.getRoleName())
                || userRoleModel.getClassId() == null);
    }

}