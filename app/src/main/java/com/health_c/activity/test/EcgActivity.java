package com.health_c.activity.test;

import android.app.Activity;
import android.os.Bundle;

import com.health_c.R;

import butterknife.ButterKnife;

/**
 * Created by Admin on 2016/8/2. 心电检测
 */
public class EcgActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg);
        ButterKnife.bind(this);
        init();
    }

    private void init() {

    }
}
