package com.example.college;

import com.example.college.MainActivity;
import com.example.college.R;
import com.example.college.database.DatabaseQuery;
import com.example.college.subject.*;
import com.example.college.web.SchoolWebViewActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchFragment extends Fragment {
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, null);
        final DatabaseQuery database_query=new DatabaseQuery(MainActivity.database,getActivity());
        final AutoCompleteTextView et_search = (AutoCompleteTextView)view.findViewById(R.id.et_search);
        et_search.setAdapter(database_query.getSchoolName());
        Button bt_search = (Button) view.findViewById(R.id.bt_search);
        Button bt_english = (Button)view.findViewById(R.id.english);
        Button bt_math = (Button)view.findViewById(R.id.math);
        Button bt_chance = (Button)view.findViewById(R.id.chance);
        Button bt_pgr = (Button)view.findViewById(R.id.program);
        Button bt_group = (Button)view.findViewById(R.id.group);
        Button bt_collage = (Button)view.findViewById(R.id.collage);
        Button bt_self = (Button)view.findViewById(R.id.self);
        Button bt_study_prg = (Button)view.findViewById(R.id.program_study);
        
        //英语资料上传
        bt_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_en = new Intent(getActivity(), EnglishActivity.class);
                startActivity(intent_en);
            }
        });
        //高数资料
        bt_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_math = new Intent(getActivity(), MathActivity.class);
                startActivity(intent_math);
            }
        });
        //概率论资料
        bt_chance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_chance = new Intent(getActivity(), ChanceActivity.class);
                startActivity(intent_chance);
            }
        });
        //编程资料
        bt_pgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_prg = new Intent(getActivity(), PrgActivity.class);
                startActivity(intent_prg);
            }
        });
        //尚未添加
        bt_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_none = new Intent(getActivity(), NoneActivity.class);
                startActivity(intent_none);
            }
        });
        //尚未添加
        bt_collage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_none = new Intent(getActivity(), NoneActivity.class);
                startActivity(intent_none);
            }
        });
        //尚未添加
        bt_self.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_none = new Intent(getActivity(), NoneActivity.class);
                startActivity(intent_none);
            }
        });
        //尚未添加
        bt_study_prg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_none = new Intent(getActivity(), NoneActivity.class);
                startActivity(intent_none);
            }
        });
        //查询按钮
        bt_search.setOnClickListener(new View.OnClickListener() {

        	Intent intent = new Intent(getActivity(),SchoolWebViewActivity.class);
            @Override
            public void onClick(View view) {
            	String sch_name = et_search.getText().toString();
            	String website;
            	
            	website=database_query.getSchoolWebsite(sch_name);
            	if(website==null)
            		Toast.makeText(getContext(), "没有查询到该高校!", Toast.LENGTH_SHORT).show();
            	else
            	{
            		Toast.makeText(getContext(), website, Toast.LENGTH_SHORT).show();
            		intent.putExtra("school_website", website);
            		startActivity(intent);
            	}
            }
        });
        findView(view);
        return view;
    }
    //
    private void findView(View view) {

    }
    
}