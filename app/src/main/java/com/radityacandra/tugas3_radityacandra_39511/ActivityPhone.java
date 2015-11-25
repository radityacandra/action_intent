package com.radityacandra.tugas3_radityacandra_39511;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ActivityPhone extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_phone);

        Button num1 = (Button) findViewById(R.id.num1);
        Button num2 = (Button) findViewById(R.id.num2);
        Button num3 = (Button) findViewById(R.id.num3);
        Button num4 = (Button) findViewById(R.id.num4);
        Button num5 = (Button) findViewById(R.id.num5);
        Button num6 = (Button) findViewById(R.id.num6);
        Button num7 = (Button) findViewById(R.id.num7);
        Button num8 = (Button) findViewById(R.id.num8);
        Button num9 = (Button) findViewById(R.id.num9);
        Button num0 = (Button) findViewById(R.id.num0);
        Button numPager = (Button) findViewById(R.id.numPager);
        Button numBintang = (Button) findViewById(R.id.numBintang);
        Button btnPanggil = (Button) findViewById(R.id.btnPanggil);

        num1.setOnClickListener((View.OnClickListener) this);
        num2.setOnClickListener((View.OnClickListener) this);
        num3.setOnClickListener((View.OnClickListener) this);
        num4.setOnClickListener((View.OnClickListener) this);
        num5.setOnClickListener((View.OnClickListener) this);
        num6.setOnClickListener((View.OnClickListener) this);
        num7.setOnClickListener((View.OnClickListener) this);
        num8.setOnClickListener((View.OnClickListener) this);
        num9.setOnClickListener((View.OnClickListener) this);
        num0.setOnClickListener((View.OnClickListener) this);
        numPager.setOnClickListener((View.OnClickListener) this);
        numBintang.setOnClickListener((View.OnClickListener) this);
        btnPanggil.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_phone, menu);
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
    public static String nomorHp;

    @Override
    public void onClick(View view) {
        EditText inputNomor = (EditText) findViewById(R.id.inputNomorHp);
        this.nomorHp = inputNomor.getText().toString();

        switch (view.getId()){
            case R.id.num1:
                this.nomorHp = this.nomorHp + "1";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num2:
                this.nomorHp = this.nomorHp + "2";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num3:
                this.nomorHp = this.nomorHp + "3";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num4:
                this.nomorHp = this.nomorHp + "4";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num5:
                this.nomorHp = this.nomorHp + "5";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num6:
                this.nomorHp = this.nomorHp + "6";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num7:
                this.nomorHp = this.nomorHp + "7";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num8:
                this.nomorHp = this.nomorHp + "8";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num9:
                this.nomorHp = this.nomorHp + "9";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.num0:
                this.nomorHp = this.nomorHp + "0";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.numPager:
                this.nomorHp = this.nomorHp + "#";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.numBintang:
                this.nomorHp = this.nomorHp + "*";
                inputNomor.setText(this.nomorHp);
                break;
            case R.id.btnPanggil:
                Uri number = Uri.parse("tel:"+this.nomorHp);
                Intent callIntent = new Intent(Intent.ACTION_CALL, number);
                startActivity(callIntent);
                break;
        }
    }
}
