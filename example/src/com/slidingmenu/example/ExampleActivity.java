package com.slidingmenu.example;

import android.os.Bundle;
import android.view.View;

import com.slidingmenu.lib.SlidingMenuActivity;

public class ExampleActivity extends SlidingMenuActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setBehindContentView(R.layout.main2);
		setBehindOffset((int)getResources().getDimension(R.dimen.actionbar_home_width));
		setBehindScrollScale(0.5f);
		this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		View v = this.getWindow().getDecorView();
	}
	
}
