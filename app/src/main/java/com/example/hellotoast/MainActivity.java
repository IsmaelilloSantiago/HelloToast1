package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView cuenta;
    private int valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuenta = (TextView)findViewById(R.id.show_count);

    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view){
        valor++;
        if(cuenta != null){
            cuenta.setText(Integer.toString(valor));
        }

       /* if(cuenta!= null){
            String cuenta_String = cuenta.getText().toString();
            int num = Integer.parseInt(cuenta_String);
            num++;
            String res = "" + num;
            cuenta.setText(res);
        }*/


    }

}