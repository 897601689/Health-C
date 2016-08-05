package com.health_c.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.health_c.R;
import com.health_c.adapter.UserListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Admin on 2016/7/29. 用户信息管理
 */
public class UserInfoActivity extends Activity {

    @BindView(R.id.user_back)
    ImageView userBack;
    @BindView(R.id.user_id_edit)
    EditText userIdEdit;
    @BindView(R.id.user_name_edit)
    EditText userNameEdit;
    @BindView(R.id.user_query_btn)
    TextView userQueryBtn;
    @BindView(R.id.user_add_btn)
    TextView userAddBtn;
    @BindView(R.id.user_update_btn)
    TextView userUpdateBtn;
    @BindView(R.id.user_del_btn)
    TextView userDelBtn;
    @BindView(R.id.user_info_list)
    ListView userInfoList;

    private ArrayList<ArrayList<String>> lists;
    private UserListAdapter adapter;
    public HashMap<String, Boolean> checkState = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
        init();
    }

    // 初始化
    private void init() {

        lists = new ArrayList<>();
        //实例化自定义适配器类
        adapter = new UserListAdapter(UserInfoActivity.this, getLayoutInflater(), lists);
        //为listView设置适配器
        userInfoList.setAdapter(adapter);

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

    @OnClick(R.id.user_back)
    protected void setUserBack() {
        this.finish();
    }

    @OnClick(R.id.user_query_btn)
    protected void setUserQueryBtn() {

    }

    @OnClick(R.id.user_add_btn)
    protected void setUserAddBtn() {

    }

    @OnClick(R.id.user_update_btn)
    protected void setUserUpdateBtn() {

    }

    @OnClick(R.id.user_del_btn)
    protected void setUserDelBtn() {

    }
}
