package cn.etransfar.stt.smarttooltest;

import android.app.Activity;
import android.os.Bundle;

public class HalfActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_half);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
