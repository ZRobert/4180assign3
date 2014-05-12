package com.example.inclass3parta;

import android.view.View;
import android.view.View.OnClickListener;

public class StorageBag implements OnClickListener{
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public StorageBag(float x) {
		super();
		this.x = x;
	}

	float x;

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
