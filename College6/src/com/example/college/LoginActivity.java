package com.example.college;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}
	public void ClickLogin(View v)
	{
		EditText username;
		EditText password;
		username=(EditText)findViewById(R.id.username);
		password=(EditText)findViewById(R.id.userpassword);
		if(username.length()==0)
		{
			new AlertDialog.Builder(this)
			.setTitle("ע��")
			.setMessage("�û���Ϊ��")
			.setPositiveButton("ȷ��",null)
			.show();
		}
		else if(password.length()==0)
		{
			new AlertDialog.Builder(this)
			.setTitle("ע��")
			.setMessage("���벻��Ϊ��")
			.setPositiveButton("ȷ��",null)
			.show();
			
		}
		else
		{
			Intent intent_math = new Intent(LoginActivity.this, SearchFragment.class);
			startActivity(intent_math);
		}
	}
}
