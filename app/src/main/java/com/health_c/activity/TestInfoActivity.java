package com.health_c.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.health_c.R;
import com.health_c.adapter.TestListAdapter;
import com.health_c.bean.TestList;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Admin on 2016/7/29. 检测报告
 */
public class TestInfoActivity extends Activity {
    @BindView(R.id.test_back)
    ImageView testBack;
    @BindView(R.id.test_query_edit)
    EditText testQueryEdit;
    @BindView(R.id.test_query_btn)
    TextView testQueryBtn;
    @BindView(R.id.test_user_btn)
    TextView testUserBtn;
    @BindView(R.id.test_all_btn)
    TextView testAllBtn;
    @BindView(R.id.test_start_txt)
    TextView testStartTxt;
    @BindView(R.id.test_end_txt)
    TextView testEndTxt;
    @BindView(R.id.test_list)
    ListView testList;


    private TestListAdapter testListAdapter;
    private List<TestList.DataEntity> list;
//    private DBOperation db;
    private String UserID = null;//当前进行检测用户
    private int SpinnerIndex; //标记要填充的类型索引
    private int SelectIndex;  //保存关联用户时选中的索引
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        SpinnerIndex = 0;
        SelectIndex = 0;
//        testStartTxt.setText(Utils.getNowTime());
//        testEndTxt.setText(Utils.getNowTime());
//        db = new DBOperation(TestActivity.this);
        list = new ArrayList<>();
        //实例化自定义内容适配类
        testListAdapter = new TestListAdapter(TestInfoActivity.this, getLayoutInflater(), list);
        //为listView设置适配
        testList.setAdapter(testListAdapter);

//        UserID = Buffer.UserID;//由缓存区获得当前关联用户IDCard
//
//        if (!UserID.equals("")) {
//            FillUserInfo(UserID);//填充被测量用户信息
//            //testUserBtn.setEnabled(false);//禁用用户关联按钮
//            FillList(0);
//        } else {
//            Toast.makeText(getApplicationContext(), "没有关联检测用户", Toast.LENGTH_SHORT).show();
//        }
    }

    @OnClick(R.id.test_back)
    protected void testBack() {
        finish();
    }

    @OnClick(R.id.test_user_btn)
    protected void testUserBtn() {

    }

    @OnClick(R.id.test_query_btn)
    protected void testQueryBtn() {

    }

    @OnClick(R.id.test_all_btn)
    protected void testAllBtn() {

    }

    @OnClick(R.id.test_start_txt)
    protected void startTime() {

    }

    @OnClick(R.id.test_end_txt)
    protected void endTime() {

    }
}
