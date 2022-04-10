package com.baoge.componentization;

import com.baoge.lib_base.BaseApplication;
import com.baoge.lib_common.LogUtil;

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.i(MyApplication.class.getSimpleName());
    }
}
