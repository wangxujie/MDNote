package com.wxj.mdnote;

import android.app.Application;

import com.wxj.mdnote.presenter.RealmDataSource;

/**
 * ====================
 * 版权所有 违法必究
 *
 * @author wangx
 * @project MDNote
 * @file BaseListAdapter
 * @create_time 2016/5/31
 * @github https://github.com/wangxujie
 * @blog http://wangxujie.github.io
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RealmDataSource.getDefault(this);
    }
}