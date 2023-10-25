package cn.etransfar.stt.smarttooltest;

import android.app.Application;

import com.transfar.smarttoolui.core.SmartToolCore;

/**
 * Title: MyApplication <br>
 * Description: <br>
 * Created DateTime: 2017-1-13 12:19
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SmartToolCore.getInstance().init(this);
    }

}
