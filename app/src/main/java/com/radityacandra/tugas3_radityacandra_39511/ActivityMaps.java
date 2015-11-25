package com.radityacandra.tugas3_radityacandra_39511;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;


public class ActivityMaps extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_maps);

        Button btnCari = (Button)findViewById(R.id.btnCari);
        btnCari.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_maps, menu);
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
        EditText inputLokasi = (EditText)findViewById(R.id.inputAlamat);
        String strLokasi = inputLokasi.getText().toString();
        switch (view.getId()){
            case R.id.btnCari:
                Uri lokasi = Uri.parse("geo:0,0?q="+strLokasi);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, lokasi);
                //cek intent bisa dijalankan atau tidak
                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
                boolean isIntentSafe = activities.size() > 0;

                if(isIntentSafe){
                    startActivity(mapIntent);
                }
                break;
        }
    }
}
