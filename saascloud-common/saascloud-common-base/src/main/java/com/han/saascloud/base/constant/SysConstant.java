package com.han.saascloud.base.constant;

/**
 * 系统全局变量
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/4 13:52
 * @Modified By:
 */
public class SysConstant {
    /**
     * 全局用户名
     */
    public static final String TOKEN_AUTH_DTO = "CURRENT_USER_DTO";

    /**
     * 超级管理员的用户ID
     */
    public static final Long SUPER_MANAGER_USER_ID = 1L;
    /**
     * 超级管理员的用户编号
     */
    public static final String SUPER_MANAGER_LOGIN_NAME = "admin";
    /**
     * 超级管理员角色ID
     */
    public static final Long SUPER_MANAGER_ROLE_ID = 1L;
    /**
     * 超级管理员组织ID
     */
    public static final Long SUPER_MANAGER_GROUP_ID = 1L;
    /**
     * 运营工作台ID
     */
    public static final Long OPER_APPLICATION_ID = 1L;

    /**
     * The constant MENU_ROOT.
     */
    public static final String MENU_ROOT = "root";

    /**
     * The constant DEFAULT_FILE_PATH.
     */
    public static final String DEFAULT_FILE_PATH = "paascloud/file/";

    /**
     * redis key default expire = 1MINUTES
     */
    public static final long REDIS_DEFAULT_EXPIRE = 1L;
}
