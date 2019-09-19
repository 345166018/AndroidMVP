package com.hongx.hxmvp2.bean;


import java.util.Date;

/**
 * @author: fuchenming
 * @create: 2019-09-17 11:12
 */

public class DuanziData {

    private String text;
    private String name;
    private String screen_name;
    private String profile_image;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
