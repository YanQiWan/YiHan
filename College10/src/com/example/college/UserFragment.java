package com.example.college;

import com.example.college.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class UserFragment extends Fragment{
	private TextView tv_UserNickname;
	private TextView tv_UserSchool;
	private TextView tv_UserMajor;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, null);
        Button exit = (Button)view.findViewById(R.id.bt_exit);
        tv_UserNickname=(TextView)view.findViewById(R.id.user_nickname);
        tv_UserSchool=(TextView)view.findViewById(R.id.user_school);
        tv_UserMajor=(TextView)view.findViewById(R.id.user_major);
        tv_UserNickname.setText(LoginActivity.login_user.getUserNickname());
        tv_UserSchool.setText(LoginActivity.login_user.getUserSchool());
        tv_UserMajor.setText(LoginActivity.login_user.getUserMajor());
        //退出登录
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_exit = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent_exit);
            }
        });
        return view;
    }
}
