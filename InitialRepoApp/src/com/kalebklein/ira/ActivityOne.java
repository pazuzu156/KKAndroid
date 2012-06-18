package com.kalebklein.ira;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.*;
import android.view.*;

public class ActivityOne extends Activity implements OnClickListener {
	
	// All the objects on the GUI
	public EditText et;
	public Button go;
	public TextView tv;
	public MenuInflater mi;
	
	// Main method for creating activity
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        createAll(); // For initializing buttons and events
    }
    
    // Described in onCreate method
    public void createAll() {
    	et = (EditText) findViewById(R.id.et);
    	go = (Button) findViewById(R.id.go);
    	tv = (TextView) findViewById(R.id.tv);
    	go.setOnClickListener(this);
    }
    
    // For the menu when menu button pressed
    @Override
    public boolean onCreateOptionsMenu(Menu m) {
    	mi = getMenuInflater();
    	mi.inflate(R.menu.mymenu, m);
    	return true;
    }
    
    // Event Handler for menu items when pressed
    @Override
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
    
    // Event handler for buttons when pressed
    public void onClick(View v) {
    	switch(v.getId()) {
    	case R.id.go:
    		String newTvText = et.getText().toString();
    		tv.setText(newTvText);
    		break;
		}
	}
}
