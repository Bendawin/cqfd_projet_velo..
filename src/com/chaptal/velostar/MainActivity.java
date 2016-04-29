package com.chaptal.velostar;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	private Button buttonVraieListe;
	private Button buttonTexteBrut;
	private Button buttonAPropos;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initViews();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void initViews(){
		
		// r�cup�ration du bouton grace � son ID
				buttonVraieListe = (Button) findViewById(R.id.buttonVraieListe);
				buttonTexteBrut = (Button) findViewById(R.id.buttonTexteBrut);
				buttonAPropos = (Button) findViewById(R.id.buttonAPropos);
				
		
		buttonVraieListe.setOnClickListener(new OnClickListener() {
					@Override
					
				// TRAITEMENT	
					public void onClick(View v){
						Toast.makeText(getApplicationContext(), "Ah, non, �a plante ... des fleurs :D ", Toast.LENGTH_LONG).show();
					}
		});
		

		buttonTexteBrut.setOnClickListener(new OnClickListener() {
			@Override
			
		// TRAITEMENT	
			public void onClick(View v){
				Toast.makeText(getApplicationContext(), "Ah, non, �a plante ... des fleurs :D ", Toast.LENGTH_LONG).show();
			}
		});
		
		buttonAPropos.setOnClickListener(new OnClickListener() {
			@Override
			
		// TRAITEMENT	
			public void onClick(View v){
				Toast.makeText(getApplicationContext(), "Ah, non, �a plante ... des fleurs :D ", Toast.LENGTH_LONG).show();
			}
		});
		
		
				
		
		
	
	}
	
}
