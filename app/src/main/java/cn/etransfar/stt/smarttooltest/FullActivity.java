package cn.etransfar.stt.smarttooltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FullActivity extends AppCompatActivity {
    private Button mButtonGoToHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);
        mButtonGoToHome= (Button) findViewById(R.id.btn_goto_home);
        mButtonGoToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
