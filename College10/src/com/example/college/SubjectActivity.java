package com.example.college;

import java.util.ArrayList;

import com.example.college.R;
import com.example.college.Internetconnection.InternetConnection;
import Commonality.CFile;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class SubjectActivity extends Activity{
	private ListView listview;
	private int DataNum;   //用于控制listview中item的数量（最大为五，小于五时动态改变）
	public static ArrayList<CFile> fileList=null;
	CFile[] cfile=null;
	int item_choose;
	CalThread calThread;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        init();   
    }
    void init()
    {
    	listview = (ListView)findViewById(R.id.list1);
        DataNum=fileList.size();
	   	cfile=new CFile[DataNum];
	   	String[] filename=new String[DataNum];
        Log.d("like",DataNum+"");
	   	for(int i=0;i<DataNum;i++)
	   	{
	   		cfile[i]=new CFile();
	   		cfile[i]=fileList.get(i);
	   		filename[i]=cfile[i].getSourceName();
	   	}
	   	ArrayAdapter<String> adapter = new ArrayAdapter<String>(SubjectActivity.this,R.layout.downloadlist,filename);
	    listview.setAdapter(adapter);
	    listview.setOnItemClickListener(new OnItemClickListener(){
		    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) 
		    {
		    	item_choose=arg2;
		    	calThread=new CalThread();
                calThread.start();
		    }
		    });
    }
    public void uploadButton(View v)
    {
		Intent intent=new Intent(SubjectActivity.this,ScanFile.class);
		startActivity(intent);
    	//浏览SD卡
    }
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	fileList=null;
    	super.onDestroy();
    }
    class CalThread extends Thread
    {
    	public void run()
    	{
    		Looper.prepare();
    		FinformationActivity.commentdatalist=new InternetConnection().UserCommentTransmit(cfile[item_choose].getSourceId());
    		Intent intent= new Intent(SubjectActivity.this, FinformationActivity.class);
	     	intent.putExtra("filedata", cfile[item_choose]);
	     	startActivity(intent);
    	   	Looper.loop();
    	}
    };
}


