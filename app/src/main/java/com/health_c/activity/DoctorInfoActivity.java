package com.health_c.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.health_c.R;
import com.health_c.adapter.DoctorListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Admin on 2016/7/29. 医生信息管理
 */
public class DoctorInfoActivity extends Activity {
    @BindView(R.id.doctor_back)
    ImageView doctorBack;
    @BindView(R.id.doctor_id_edit)
    EditText doctorIdEdit;
    @BindView(R.id.doctor_name_edit)
    EditText doctorNameEdit;
    @BindView(R.id.doctor_query_btn)
    TextView doctorQueryBtn;
    @BindView(R.id.doctor_add_btn)
    TextView doctorAddBtn;
    @BindView(R.id.doctor_update_btn)
    TextView doctorUpdateBtn;
    @BindView(R.id.doctor_del_btn)
    TextView doctorDelBtn;
    @BindView(R.id.doctor_info_list)
    ListView doctorInfoList;

    private ArrayList<ArrayList<String>> lists;
    private DoctorListAdapter adapter;
    public HashMap<String, Boolean> checkState = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        ButterKnife.bind(this);
        init();
    }


    private void init() {
        lists = new ArrayList<>();
        //实例化自定义适配器类
        adapter = new DoctorListAdapter(DoctorInfoActivity.this, getLayoutInflater(), lists);
        //为listView设置适配器
        doctorInfoList.setAdapter(adapter);
        FillList();
    }
    // 填充列表
    private void FillList() {
        for (int i = 0; i < 20; i++) {
            ArrayList<String> ss = new ArrayList<>();
            ss.add("15042319930309001" + i);
            ss.add("姓名" + i);
            ss.add("男");
            ss.add("2" + i);
            lists.add(ss);
        }
        adapter.notifyDataSetChanged();
    }

    @OnClick(R.id.doctor_back)
    protected void setDoctorBack() {
        this.finish();
    }

    @OnClick(R.id.doctor_query_btn)
    protected void setDoctorQueryBtn() {

    }

    @OnClick(R.id.doctor_add_btn)
    protected void setDoctorAddBtn() {

    }

    @OnClick(R.id.doctor_update_btn)
    protected void setDoctorUpdateBtn() {

    }

    @OnClick(R.id.doctor_del_btn)
    protected void setDoctorDelBtn() {

    }
}
