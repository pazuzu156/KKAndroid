package com.kalebklein.ira;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*d;
import android.content.*;

public class ActivityOne extends Activity implements OnClickListener {
	
	public EditText et;
	public Button go;
	public TextView tv;
	public MenuInflater mi;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        createAll();
    }
    
    public void createAll() {
    	et = (EditText) findViewById(R.id.et);
    	go = (Button) findViewById(R.id.go);
    	tv = (TextView) findViewById(R.id.tv);
    	go.setOnClickListener(this);
    }
    
    public boolean onCreateOptionsMenu(Menu m) {
    	mi = getMenuInflater();
    	mi.inflate(R.menu.mymenu, m);
    	return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem i) {
    	switch(i.getItemId()) {
    	case R.id.about:
    		Intent about = new Intent(ActivityOne.this, ActivityAbout.class);
    		startActivity(about);
    		break;
    	case R.id.close:
    		ActivityOne.this.finish();
    		break;
    	}
    	return false;
    }
    
    public void onClick(View v) {
    	switch(v.getId()) {
    	case R.id.go:
    		String newTvText = et.getText().toString();
    		tv.setText(newTvText);
    		break;
    	}
    }
}
