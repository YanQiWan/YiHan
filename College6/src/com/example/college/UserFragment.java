package com.example.college;

import com.example.college.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/*
 * 
 */
public class UserFragment extends Fragment{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, null);
        Button exit = (Button)view.findViewById(R.id.bt_exit);
        //閫�鍑虹櫥褰曟寜閽�
        /*exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_exit = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent_exit);
            }
        });*/
        findView(view);
        return view;
    }
    //鍒濆鍖杤iew
    private void findView(View view) {


    }
}
