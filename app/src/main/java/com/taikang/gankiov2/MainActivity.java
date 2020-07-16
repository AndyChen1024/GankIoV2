package com.taikang.gankiov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.taikang.jartesttest.ShowTestInfo;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvMain = findViewById(R.id.tv_main);
        tvMain.setText(ShowTestInfo.show());
    }
}
