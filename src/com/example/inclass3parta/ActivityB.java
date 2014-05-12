//Robert Payne
//in class 3
package com.example.inclass3parta;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class ActivityB extends Activity implements OnClickListener {
	Button b1;
	TextView tv;
	String name;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
		
		b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(this);  
		tv = (TextView) findViewById(R.id.textView1);
		if(getIntent().getExtras()!=null){
    	if (getIntent().getExtras().containsKey("Data")) {
    		name = getIntent().getExtras().getString("Data");
    		tv.setText(name);
    //		Toast.makeText(this, "Welcome " + name, Toast.LENGTH_LONG).show();
    	}
    }
	}
 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_b, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		finish();
	}

}
