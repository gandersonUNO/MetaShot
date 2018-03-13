package com.andersonlucier.android.metashot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

import com.andersonlucier.android.servicelib.Service;
import com.andersonlucier.android.servicelib.impl.ShootingRecord;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        Service service = new Service();
        ShootingRecord shooting = service.getShootingRecordById();
        Log.d("attempt", shooting.description());
    }
    public void onClick(View view){
        if (view.getId() == R.id.newRecord) {
            startActivity(new Intent(MainActivity.this, NewShootingRecord.class));
        }
    }
}

