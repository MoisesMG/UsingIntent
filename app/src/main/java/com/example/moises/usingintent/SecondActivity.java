package com.example.moises.usingintent;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;
import android.net.Uri;
/**
 * Created by Moises on 04/10/2016.
 */

public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle saveInstateState){
        super.onCreate(saveInstateState);
        setContentView(R.layout.secondactivity);
    }

    public void onClick(View v){
        Intent data = new Intent();

        //--obtner la vista del edit text
        EditText txt_username = (EditText) findViewById(R.id.txt_username);

        //-- establecer los datos a pasar a la MainActivity.java --
        data.setData( Uri.parse(
           txt_username.getText().toString()
        ));

        setResult(RESULT_OK, data);

        //--Cierra la actividad
        finish();
    }//fin del metodo
}//fin de la clase
