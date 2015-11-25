package com.radityacandra.tugas3_radityacandra_39511;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainNavigation extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);

        Button btnMaps = (Button)findViewById(R.id.btnMaps);
        Button btnBrowser = (Button)findViewById(R.id.btnBrowser);
        Button btnContact = (Button)findViewById(R.id.btnPhone);

        btnMaps.setOnClickListener((View.OnClickListener) this);
        btnBrowser.setOnClickListener((View.OnClickListener) this);
        btnContact.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnMaps:
                //intent ke activity maps
                Intent maps = new Intent(MainNavigation.this, ActivityMaps.class);
                startActivity(maps);
                break;
            case R.id.btnBrowser:
                //intent ke activity browser
                Intent browser = new Intent(MainNavigation.this, ActivityBrowser.class);
                startActivity(browser);
                break;
            case R.id.btnPhone:
                //intent ke activity Phone
                Intent phone = new Intent(MainNavigation.this, ActivityPhone.class);
                startActivity(phone);
                break;
        }
    }
}
