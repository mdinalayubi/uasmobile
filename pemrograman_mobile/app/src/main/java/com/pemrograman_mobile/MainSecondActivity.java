package com.pemrograman_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainSecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.hellotoast.extra.REPLY";
    private EditText mReply;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        mReply = findViewById(R.id.editText_second);
        Intent tampil = getIntent();
        String pesan = tampil.getStringExtra(MainFirstActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(pesan);
    }
    public void returnReply(View view){
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}