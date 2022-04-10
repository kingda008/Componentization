package com.baoge.ft_login.app_dir;

import com.baoge.lib_base.BaseApplication;
import com.baoge.lib_common.LogUtil;

public class LoginApplication extends BaseApplication {
    public static int index = 1;

    @Override
    public void onCreate() {
        super.onCreate();
        index = 2;
        LogUtil.i(com.baoge.ft_login.app_dir.LoginApplication.class.getSimpleName());
    }
}
