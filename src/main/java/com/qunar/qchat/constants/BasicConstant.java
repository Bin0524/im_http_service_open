package com.qunar.qchat.constants;

import java.util.Arrays;
import java.util.List;

/**
 * BasicConstant
 *
 * @author binz.zhang
 * @date 2019/1/29
 */
public class BasicConstant {
    /**
     * c_key 常量
     */
    public static final String CKEY_SPLITTER = "&";
    public static final String CKEY_JOINER = "=";
    public static final String CKEY_USERID = "u";
    public static final String CKEY_USERDOMAIN = "d";

    /**
     * 用户类型常量
     */
    public static final List<String> SPECIALDEPS = Arrays.asList(new String[]{"权一组", "安置组"});
    public static final String USERTYPE_HOTLINE = "H";
    public static final String USERTYPE_NORMAL = "U";
    public static final String USERTYPE_SPECILA = "S";
    public static final String USERTYPE_ROBOT = "R";
    /**
     * 组织架构常量，redis存放(0-2)全局默认设置，整型变量。3是部门的单独设置
     *     ALL(0,"全员可见"), 公司的的员工可以看到所有的组织架构
     *     NONE(1,"全员不可见"), 公司的员工都看不到组织架构
     *     INNER(2,"仅自己部门内可见"), 公司的员工只能看到自己部门下面的组织架构
     *     SPECIFIC(3,"特定部门可见");  //指定该部门可以看见那些部门
     */
    public static final String DEP_VISIBLE_REDIS_KEY = "startalk:dep:visible:set";

}
