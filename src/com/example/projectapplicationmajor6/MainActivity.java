package com.example.projectapplicationmajor6;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	Button mybtn;
	ImageView img;
	Bitmap bmp1, bmp2;
//dickwatt jenish shkay edited 1
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mybtn = (Button) findViewById(R.id.button1);
		img = (ImageView) findViewById(R.id.imageView1);
		bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.blackbody);
		bmp2 = BitmapFactory.decodeResource(getResources(), R.drawable.frame5);

		mybtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				overlay(bmp1, bmp2);
			}

			private void overlay(Bitmap bmp1, Bitmap bmp2) {
				// TODO Auto-generated method stub
				Bitmap bmOverlay = Bitmap.createBitmap(bmp1.getWidth(),
						bmp1.getHeight(), bmp1.getConfig());
				Canvas canvas = new Canvas(bmOverlay);
				canvas.drawBitmap(bmp1, new Matrix(), null);
				canvas.drawBitmap(bmp2, new Matrix(), null);
				img.setImageBitmap(bmOverlay);
			}
		});
	}

}
