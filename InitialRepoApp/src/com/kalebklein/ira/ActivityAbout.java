package com.kalebklein.ira;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class ActivityAbout extends Activity implements OnClickListener {
	public Button abClose;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		createAll();
	}
	
	public void createAll() {
		abClose = (Button) findViewById(R.id.abClose);
		abClose.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.abClose:
			ActivityAbout.this.finish();
			break;
		}
	}
}
