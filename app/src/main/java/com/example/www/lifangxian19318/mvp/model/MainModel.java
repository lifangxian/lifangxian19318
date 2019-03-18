package com.example.www.lifangxian19318.mvp.model;

public interface MainModel{
    interface Callbacks{
        void success(String data);
        void fail();
    }
    void dovoid(Callbacks callbacks);
}
