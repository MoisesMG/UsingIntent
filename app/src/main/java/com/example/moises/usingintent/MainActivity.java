package com.example.moises.usingintent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    //codigo de respuesta de la actividad
    int request_code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        /**
         * sentencia para ir a otra actividad
        * startActivity(new Intent("com.example.moises.SecondActivity"));
         */

        /*Si la actividad que vamos a llamar esta en el mismo paqueta
        * de nuesta aplicacion, entonces la linea de codigo debe ser
        * la siguienye:
        * startActivity(this,SecondActivity.class); */

        startActivityForResult(new Intent("com.example.moises.SecondActivity"),
                request_code);
        }//fin del metodo

        public void onActivityResult(int requestCode, int resultCode, Intent data){
            if(requestCode == request_code){
                if(resultCode == RESULT_OK){
                    Toast.makeText(this,data.getData().toString(),
                            Toast.LENGTH_SHORT).show();

                    TextView txt_datosRecuperados =
                            (TextView) findViewById(R.id.txt_datosRecuperados);
                    txt_datosRecuperados.setText(data.getData().toString());
                }//fin if interno
            }//fin if externo
        }//fin del metodo

}//fin de la calase
