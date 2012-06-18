package com.kalebklein.ira;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityMain extends ListActivity {

	// Array holding class names for menu list
	String classes[] = { "ActivityOne" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(ActivityMain.this, android.R.layout.simple_list_item_1, classes));
	}

	// Selection of the items in menu list
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		String c = classes[position]; // Grab position of each item clicked
		try {
			Class cclass = Class.forName("com.kalebklein.ira." + c); // class selection for the item
			Intent i = new Intent(ActivityMain.this, cclass);
			startActivity(i);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
