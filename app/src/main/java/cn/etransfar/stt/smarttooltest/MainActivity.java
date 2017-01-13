package cn.etransfar.stt.smarttooltest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.transfar.smarttoolui.main.FloatWindowService;
import com.transfar.tda.core.LogTDA;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 */
public class MainActivity extends AppCompatActivity {
    private Button   mBtn_half, mBtn_all, mBtn_exception,mBtn_network;
    private TextView mBtn_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn_enter = (Button) findViewById(R.id.btn_enter);
        mBtn_half = (Button) findViewById(R.id.btn_half);
        mBtn_all = (Button) findViewById(R.id.btn_all);
        mBtn_exception = (Button) findViewById(R.id.btn_throw_exception);
        mBtn_network= (Button) findViewById(R.id.btn_network);
        mBtn_half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HalfActivity.class));
            }
        });
        mBtn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FullActivity.class));

            }
        });
        mBtn_exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ExceptionActivity.class));
            }
        });
        mBtn_network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestBody requestBody = new MultipartBody.Builder()
                        .addFormDataPart("page", "1")
                        .build();
                final Request request = new Request.Builder()
                        .url("http://apis.baidu.com/showapi_open_bus/showapi_joke/joke_text")
                        .addHeader("apikey", "dbdbebc2730f35c334c98d8db993290b")
                        .post(requestBody)
                        .build();
                final OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                        .connectTimeout(10, TimeUnit.SECONDS)
                        .writeTimeout(10, TimeUnit.SECONDS)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .build();
                mOkHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        LogTDA.SDKinfo("request result:", "request failed");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        LogTDA.SDKinfo("request result:", response.body().string());
                    }
                });
            }

        });
        Intent intent = new Intent(MainActivity.this, FloatWindowService.class);
        startService(intent);
        mBtn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.transfar.smarttoolui.main.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
