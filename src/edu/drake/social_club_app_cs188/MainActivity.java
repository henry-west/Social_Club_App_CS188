//Meredith
//Test Commit #2
//this is a comment
//this is giuliani adding a comment. 
package edu.drake.social_club_app_cs188;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	
	public void Screen2(View view) {
		Intent intent = new Intent(this, Screen2.class);
		startActivity(intent);
	}
	public void Screen3(View view) {
		Intent intent = new Intent(this, Screen3.class);
		startActivity(intent);
	}
	public void Screen4(View view) {
		Intent intent = new Intent(this, Screen4.class);
		startActivity(intent);
	}
	public void Screen5(View view) {
		Intent intent = new Intent(this, Screen5.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
}
