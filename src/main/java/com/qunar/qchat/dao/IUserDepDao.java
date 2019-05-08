package com.qunar.qchat.dao;

import com.qunar.qchat.dao.model.UserDepModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface IUserDepDao {

    UserDepModel selectDepInfo(@Param("depName")String dep);
}
