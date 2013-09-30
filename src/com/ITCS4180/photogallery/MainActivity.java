



package com.ITCS4180.photogallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button photosBtnObj = (Button) findViewById(R.id.photosBtn);
		photosBtnObj.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Perform action on click

			}
		});

		final Button slideshowBtnObj = (Button) findViewById(R.id.slideshowBtn);
		slideshowBtnObj.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Perform action on click

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
