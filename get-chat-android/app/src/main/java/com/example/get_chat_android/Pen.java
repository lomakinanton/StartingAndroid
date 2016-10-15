package com.example.get_chat_android;


public class Pen {
    private boolean isEnable=false;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    void changeEnabled(){
        isEnable=!isEnable;
    }
}
