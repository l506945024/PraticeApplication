package com.lq.example.livedata;

import android.arch.lifecycle.LiveData;

/**
 * description:
 * 1.创建数据类继承LiveData<T>
 *
 *
 * @author:mick
 * @time:2018/11/16
 */
public class UserInfoModelString extends LiveData<String> {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //这里条用setvalue是为了让观察者接收到消息执行onchange方法
        setValue(name);
    }
   // 此方法是当处于激活状态的observer个数从0到1时，该方法会被调用。
    @Override
    protected void onActive() {
        super.onActive();
    }
    //此方法是当处于激活状态的observer个数从1变为0时，该方法会被调用。
    @Override
    protected void onInactive() {
        super.onInactive();
    }
}
