package com.hongx.hxmvp2.bean;

/**
 * @author: fuchenming
 * @create: 2019-09-17 11:11
 */
import java.util.List;

public class DuanziRootBean {

    private int code;
    private String msg;
    private List<DuanziData> data;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public void setData(List<DuanziData> data) {
        this.data = data;
    }
    public List<DuanziData> getData() {
        return data;
    }

}