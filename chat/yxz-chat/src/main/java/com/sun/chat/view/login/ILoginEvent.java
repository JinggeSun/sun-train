package com.sun.chat.view.login;

/**
 * 窗体事件接口
 * @author zcm
 */
public interface ILoginEvent {

    /**
     * 登陆验证
     * @param userId        用户 ID
     * @param userPassword  用户密码
     */
    void doLoginCheck(String userId, String userPassword);
}
