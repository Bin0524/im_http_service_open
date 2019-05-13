package com.qunar.qchat.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qunar.qchat.dao.IUserInfo;
import com.qunar.qchat.model.JsonResult;
import com.qunar.qchat.model.UserInfo;
import com.qunar.qchat.model.UserInfoParam;
import com.qunar.qchat.utils.JsonResultUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("/corp/userinfo/")
@RestController
public class QGetUserInfoController {
    @Resource
    private IUserInfo iUserInfo;

    @RequestMapping(value = "/get_user_info.qunar", method = RequestMethod.POST)
    public JsonResult<?> getUserInfo(@RequestBody String json) {
        try {

            ObjectMapper mapper = new ObjectMapper();
            UserInfoParam params = mapper.readValue(json, UserInfoParam.class);

            List<UserInfoParam.UsersEntity> users = params.getUsers();
            String system = params.getSystem();

            if (system.equals("")) {
                return JsonResultUtils.fail(2, "system is empty");
            }

            if (users.size() == 0) {
                return JsonResultUtils.fail(2, "username is empty");
            }


            List<UserInfo> list = new ArrayList<>();
            list = iUserInfo.selectUserInfo(users);

            if (list.size() == 0) {
                return JsonResultUtils.fail(2, "not found username");
            }

            return JsonResultUtils.success(list);

        } catch (Exception e) {
            e.printStackTrace();
            return JsonResultUtils.fail(1, "服务器操作异常:\n " + ExceptionUtils.getStackTrace(e));
        }
    }
}
