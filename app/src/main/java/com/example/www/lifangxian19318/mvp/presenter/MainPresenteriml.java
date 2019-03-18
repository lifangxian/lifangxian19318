package com.example.www.lifangxian19318.mvp.presenter;

import com.example.www.lifangxian19318.mvp.model.MainModel;
import com.example.www.lifangxian19318.mvp.view.MainView;

public class MainPresenteriml implements MainPresenter, MainModel.Callbacks {
    private MainModel mainModel;
    private MainView mainView;

    public MainPresenteriml(MainModel mainModel, MainView mainView) {
        this.mainModel = mainModel;
        this.mainView = mainView;
    }

    @Override
    public void dopresenter() {
        mainModel.dovoid(this);
    }

    @Override
    public void success(String data) {
        mainView.success(data);
    }

    @Override
    public void fail() {
        mainView.fail();
    }
    public void destory() {
        if(mainView!=null){
            mainView=null;
        }
        if(mainModel!=null){
            mainView=null;
        }
        //通知回收机制可以回收了
        System.gc();
    }
}
