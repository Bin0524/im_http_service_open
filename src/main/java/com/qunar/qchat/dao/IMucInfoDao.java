package com.qunar.qchat.dao;

import com.qunar.qchat.dao.model.MucIncrementInfo;
import com.qunar.qchat.dao.model.MucInfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMucInfoDao {

    List<MucIncrementInfo> selectMucIncrementInfo(
            @Param("u") String u,
            @Param("d") String d,
            @Param("t") Double t
    );

    List<MucIncrementInfo> selectMucIncrementInfoNew(
            @Param("u") String u,
            @Param("d") String d,
            @Param("t") String t);


    MucInfoModel updateMucInfo(MucInfoModel mucInfo);


    List<MucInfoModel> selectMucInfoByIds(@Param("ids") List<String> ids);


    int checkMucExist(@Param("mucName") String mucName);
}
