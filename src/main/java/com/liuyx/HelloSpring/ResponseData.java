package com.liuyx.HelloSpring;

import com.alibaba.fastjson.JSONObject;

public class ResponseData {
    private String msg;
//    private int code;
    private JSONObject data;
    public ResponseData(String msg) {
        this.msg = msg;
    }
}
