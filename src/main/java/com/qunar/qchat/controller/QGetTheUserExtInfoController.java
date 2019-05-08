package com.qunar.qchat.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.qunar.qchat.constants.BaseCode;
import com.qunar.qchat.model.GetTelResult;
import com.qunar.qchat.model.JsonResult;
import com.qunar.qchat.model.UserInfoOaReturn;
import com.qunar.qchat.model.request.GetLeaderRequest;
import com.qunar.qchat.model.request.GetMobileRequest;
import com.qunar.qchat.service.GetUserExtInfoService;
import com.qunar.qchat.utils.JacksonUtils;
import com.qunar.qchat.utils.JsonResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 获取用户的额外的信息,目前支持手机号跟直属领导的信息
 */
@RequestMapping("/newapi/")
@RestController
@Slf4j
public class QGetTheUserExtInfoController {
    @Resource
    private GetUserExtInfoService getUserExtInfoService;

    @PostMapping("/getMobile.qunar")
    @ResponseBody
    public GetTelResult getMobiel(@RequestBody GetMobileRequest getMobileRequest) {
        return getUserExtInfoService.getTheMobile(getMobileRequest);
    }

    @PostMapping("/getLeader.qunar")
    @ResponseBody
    public GetTelResult getLeader(@RequestBody GetLeaderRequest getLeaderRequest) {
        return getUserExtInfoService.getLeader(getLeaderRequest);
    }
    @PostMapping("/getOa.qunar")
    @ResponseBody
    public JsonResult getOa(@RequestBody String  param) {
        JSONObject jsonObject = JSONObject.parseObject(param);

        String userId = jsonObject.getString("userId");
        String host = jsonObject.getString("host");
        if(Strings.isNullOrEmpty(userId)){
            log.error("get oa info fail due to userId is empty");
            return JsonResultUtils.fail(BaseCode.BADREQUEST.getCode(),BaseCode.BADREQUEST.getMsg());
        }
        UserInfoOaReturn result =  getUserExtInfoService.getOaInfo(userId,host);
        return JsonResultUtils.success(result);
    }
}
