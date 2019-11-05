package com.example.latihan101_tugas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button bquiz1, bquiz2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bquiz1 = (Button)findViewById(R.id.btnquiz1);
        bquiz2 = (Button)findViewById(R.id.btnquiz2);
        
        bquiz1.setOnClickListener(clickQuiz1);
        bquiz2.setOnClickListener(clickQuiz2);
    }

    private View.OnClickListener clickQuiz1 = new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MainActivity.this, Quiz1.class);
			startActivity(intent);
		}
	};
	
	private View.OnClickListener clickQuiz2 = new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MainActivity.this, Quiz2.class);
			startActivity(intent);
		}
	};
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
