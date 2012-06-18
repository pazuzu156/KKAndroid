package com.kalebklein.ira;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityMain extends ListActivity {

	String classes[] = { "ActivityOne" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(ActivityMain.this, android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		String c = classes[position];
		try {
			Class cclass = Class.forName("com.kalebklein.ira." + c);
			Intent i = new Intent(ActivityMain.this, cclass);
			startActivity(i);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
