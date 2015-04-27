package com.zcy.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button btnDate;
	private Button btnTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnDate = (Button) findViewById(R.id.button1);
		btnTime = (Button) findViewById(R.id.button2);
		btnDate.setOnClickListener(this);
		btnTime.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			showDialog("当前日期",sdf.format(new Date()));
			break;
		case R.id.button2:
			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
			showDialog("当前时间",sdf1.format(new Date()));
			break;
		}
	}

	private void showDialog(String title, String msg) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setIcon(android.R.drawable.ic_dialog_info);
		builder.setTitle(title);
		builder.setMessage(msg);
		builder.setPositiveButton("确定", null);
		builder.create().show();
	}
}
