package com.example.college;

import java.util.ArrayList;
import Commonality.CFile;
import Commonality.UserComment;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FinformationActivity extends Activity {
	private ListView commentlist;
	private CFile file;
	private TextView filedata;
	public static ArrayList<UserComment> commentdatalist=null;
	int commentdatanum;
	String[] commentdata=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finformation);
		Bundle bundle=getIntent().getExtras();
		file=(CFile)bundle.get("filedata");
		init();
	}
	public void init()
	{
		filedata = (TextView)findViewById(R.id.filedata);
		String data ="文件名:\t"+file.getSourceName()+"\n大小:\t"+file.getSourceSize()+"\n上传者:\t"+file.getUploader()+"\n上传时间：\t"+file.getUploadTime();
		filedata.setText(data);
		commentlist=(ListView)findViewById(R.id.commentlist);
		commentdatanum=commentdatalist.size();
		commentdata=new String[commentdatanum];
		for(int i=0;i<commentdatanum;i++)
		{
			commentdata[i]="用户:"+commentdatalist.get(i).getUserNickname()+"\t于\t"+commentdatalist.get(i).getCommentTime()+"\t评论了:\n"+commentdatalist.get(i).getCommentContent();
		}
		ArrayAdapter<String> commentadapter = new ArrayAdapter<String>(this,R.layout.downloadlist,commentdata);
		commentlist.setAdapter(commentadapter);
	}
	public void onClickDownload(View v)
	{
		
	}
}
