package com.lq.example.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * description:创建数据类
 * 1.创建一个数据类继承ViewModel
 * 2.在类中声明MutableLiveData<T>的属性
 * 3.对属性设置get方法
 * @author:mick
 * @time:2018/11/16
 */
public class UserInfModel extends ViewModel {
    MutableLiveData<String> mUserName;

    public MutableLiveData<String> getUserName() {
        if (mUserName == null) {
            mUserName = new MutableLiveData<>();
        }
        return mUserName;
    }
}
