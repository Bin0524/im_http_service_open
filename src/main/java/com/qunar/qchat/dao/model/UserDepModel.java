package com.qunar.qchat.dao.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Data
@Slf4j
public class UserDepModel {
    private Integer id;
    private String depName;  //部门名称
    private Integer depLevel;  //部门级别
    private Integer parentId; //上级部门
    private String depVp;       //部门vp
    private String depHr;       //部门HR
    private String depVisible;  //部门对那些部门可见
    private String depLeader;   //部门主管
    private Integer deleteFlag=0;//部门删除标记
    private Integer maxDeep;     //下面子部门的最大深度
    private String depDesc="";
    private Timestamp createTime;  //部门创建时间
    private Timestamp updateTime;  //部门信息更改时间
}
