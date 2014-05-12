//Robert Payne
//in class 3
package com.example.inclass3parta;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityA extends Activity implements OnClickListener {
	// Button b;
	TextView tv;
	String name;
	Button b1;
	Button b2;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.textView1);
        if(getIntent().getExtras()!=null){
        	if (getIntent().getExtras().containsKey("Data")) {
        		name = getIntent().getExtras().getString("Data");
        		tv.setText(name);
   //     		Toast.makeText(this, "Welcome " + name, Toast.LENGTH_LONG).show();
        	}
        }      
	}
        
        @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		Intent i;
		if(arg0.getId() == R.id.button1) {
		// TODO Auto-generated method stub
		i = new Intent(getBaseContext(),ActivityB.class);
		i.putExtra("Data", String.valueOf(Float.parseFloat((name))*2));
		//Log.d("Demo", );
		startActivity(i);
		}
		else
			finish();
	}
}
