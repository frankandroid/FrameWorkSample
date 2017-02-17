package com.hhly.frameworksample.ui.main;

import com.hhly.data.bean.NewsBean;

/**
 * @创建者 frank
 * @时间 2017/2/17 16:05
 * @描述：${TODO}
 */

public class MainModel implements MainContact.Model {

    //在这里对数据进行处理。
    @Override
    public NewsBean disPoseNewsBean(NewsBean newsBean) {

        newsBean.getStories().get(0).setTitle("我是经过处理后的标题，哇哈哈哈哈哈");
        return newsBean;

    }
}
