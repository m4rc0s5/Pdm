package com.unisc.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaTimestamp;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity  extends AppCompatActivity {
    int i = 0;
    private char bt1;
    private EditText editTextd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.bt1);
        editTextd = findViewById(R.id.editText);
      /*/
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener());*/
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CICLO", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CICLO", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CICLO", "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CICLO", "onDestroy");
    }

    public void onClick(View v) {


    }

   public void Click1(View view) {
        String valordigitado = editTextd.getText().toString();
        if(!valordigitado.isEmpty()){
            Intent intent = new Intent(this, OUTRAactivity.class);
            intent.putExtra("Celcius",valordigitado);
            startActivity(intent);
        }
   }
}



