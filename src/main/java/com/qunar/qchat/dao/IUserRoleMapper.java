package com.qunar.qchat.dao;

import com.qunar.qchat.dao.model.UserRoleClassModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserRoleMapper {

    void insertRoleSelective(IUserRoleMapper startalkRoleModel);

    Integer selectUserRoleAvailable(@Param("roleName") String roleName);


    void updateUserRoleAvailable(@Param("roleName") String roleName, @Param("avaFlag") Integer flag);

    void updateRoleClassAvailable(@Param("roleClass") String roleName, @Param("avaFlag") Integer flag);


    Integer selectRoleClassAvailable(@Param("roleClass") String roleName);

    void insertRoleClassSelective(UserRoleClassModel startalkRoleClassModel);

    List<UserRoleClassModel> selectAvailableUseRoleClass();

    List<IUserRoleMapper> selectAllRole();


    List<UserRoleClassModel>selectAllRoleClass();

    void updateRole(IUserRoleMapper startalkRoleModel);

    void updateRoleAvailable(@Param("roleId") Integer id, @Param("availFlag") Integer avFlag);

    String selectRoleNameById(@Param("id")Integer id);

}
