package com.fiuba.taller2.musicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginFacebook extends AppCompatActivity {
    public static final String tag = "Mensaje_app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facebook);
        Log.i(tag,"onCreate");
    }

    public void onSumarClick(View v){
        EditText n1 = (EditText) findViewById(R.id.numero1);
        EditText n2 = (EditText) findViewById(R.id.numero2);
        TextView resultado = (TextView) findViewById(R.id.Resultado);
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());

        int suma = num1 + num2;
        resultado.setText(Integer.toString(suma));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag,"onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag,"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag,"onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag,"onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag,"onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag,"onDestroy");
    }
}
