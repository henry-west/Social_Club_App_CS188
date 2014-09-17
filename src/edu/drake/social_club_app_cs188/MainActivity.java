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
	
	
	public void Calendar(View view) {
		Intent intent = new Intent(this, Calendar.class);
		startActivity(intent);
	}
	
	public void Categories(View view) {
		Intent intent = new Intent(this, Categories.class);
		startActivity(intent);
	}
	public void EventPage(View view) {
		Intent intent = new Intent(this, EventPage.class);
		startActivity(intent);
	}
	
	public void Favorites(View view) {
		Intent intent = new Intent(this, Favorites.class);
		startActivity(intent);
	}
	public void HomeMenu(View view) {
		Intent intent = new Intent(this, HomeMenu.class);
		startActivity(intent);
	}
	
	public void IndividualCategory(View view) {
		Intent intent = new Intent(this, IndividualCategory.class);
		startActivity(intent);
	}
	public void IndividualDay(View view) {
		Intent intent = new Intent(this, IndividualDay.class);
		startActivity(intent);
	}
	
	public void Search(View view) {
		Intent intent = new Intent(this, Search.class);
		startActivity(intent);
	}
	public void Suggestions(View view) {
		Intent intent = new Intent(this, Suggestions.class);
		startActivity(intent);
	}
	
	public void Today(View view) {
		Intent intent = new Intent(this, Today.class);
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
