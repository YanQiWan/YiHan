package com.example.college.datatransport;

import java.io.File;
import com.example.college.R;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class DatabaseQuery {
	private SQLiteDatabase database;
	private Context context;
	public DatabaseQuery(File file,Context context)
	{
		database=SQLiteDatabase.openOrCreateDatabase(file, null);
		this.context=context;
	}
	public String getSchoolWebsite(String schoolname)
	{
		Cursor cursor=database.rawQuery("select * from school where name=?",new String[]{schoolname});
		if(cursor.moveToNext())
		{
			String website=cursor.getString(cursor.getColumnIndex("website"));
			return website;
		}
		return null;
	}
	public ArrayAdapter<String> getSchoolName()
	{
		ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(context,R.layout.autotextview, new String[]{"长安大学","清华大学","北京大学","西安电子科技大学","西北工业大学"});
		return arrayAdapter;
	}
}
