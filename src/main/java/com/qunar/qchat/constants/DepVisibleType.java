package com.qunar.qchat.constants;

public enum DepVisibleType {
    ALL(0,"全员可见"), //该部门所有员工都能看见全公司的组织架构
    NONE(1,"全员不可见"), //该部门员工看不到任何组织架构
    INNER(2,"仅自己部门内可见"), //该部门员工只能看到其直属部门的组织架构
    SPECIFIC(3,"特定部门可见");  //指定该部门可以看见那些部门
    private Integer type;
    private String desc;

    DepVisibleType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }


    public String getDesc() {
        return desc;
    }

    public static DepVisibleType of(Integer type) {
        for (DepVisibleType fileType : DepVisibleType.values()) {
            if (fileType.type.equals(type)) {
                return fileType;
            }
        }
        return null;
    }
}
