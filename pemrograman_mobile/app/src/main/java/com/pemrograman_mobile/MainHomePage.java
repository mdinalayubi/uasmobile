package com.pemrograman_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainHomePage extends AppCompatActivity {

    Button btnHello;
    Button btnCount;
    Button btnSianida;
    Button btnTwoActivity;
    Button btnMaps;
    Button btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setLayout();
        setKlik();
    }

    void setLayout() {
        btnHello = findViewById(R.id.btnHello);
        btnCount = findViewById(R.id.btnCount);
        btnSianida = findViewById(R.id.btnSianida);
        btnTwoActivity = findViewById(R.id.btnTwoActivity);
        btnMaps = findViewById(R.id.btnMaps);
        btnFragment = findViewById(R.id.btnFragment);
    }

    void setKlik() {
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenthello = new Intent(MainHomePage.this, MainActivity.class);
                startActivity(intenthello);
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcount = new Intent(MainHomePage.this, MainToast.class);
                startActivity(intentcount);
            }
        });

        btnSianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsianida = new Intent(MainHomePage.this, MainScrollice.class);
                startActivity(intentsianida);
            }
        });

        btnTwoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttwoactivity = new Intent(MainHomePage.this, MainFirstActivity.class);
                startActivity(intenttwoactivity);
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainHomePage.this,MainMaps.class);
                startActivity(intent);
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainHomePage.this,MainFragment.class);
                startActivity(intent);
            }
        });
    }

    public void createAlarm(View view) {
        ArrayList<Integer> alarmDays = new ArrayList<>();
        alarmDays.add(2);
        alarmDays.add(3);
        alarmDays.add(4);
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_DAYS, alarmDays)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Testing")
                .putExtra(AlarmClock.EXTRA_HOUR, 7)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30)
                .putExtra(AlarmClock.EXTRA_VIBRATE, false)
                .putExtra(AlarmClock.EXTRA_RINGTONE, "VALUE_RINGTONE_SILENT");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}