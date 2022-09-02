package com.example.tarea_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

var uno:CheckBox?=null;
var dos:CheckBox?=null;
var tres:CheckBox?=null;
var cuatro:CheckBox?=null;
var cinco:CheckBox?=null;
var button : Button? = null;

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.dos2);
        cuatro = findViewById(R.id.dos3);
        cinco = findViewById(R.id.dos4);

    }

    override fun onClick(view: View?) {
        val opcion1 = uno?.isChecked;
        if (opcion1 == true) {
            Toast.makeText(this, "sables de luz Seleccionada !!", Toast.LENGTH_LONG).show();
        }
        if (dos?.isChecked == true){
            Toast.makeText(this,"palomera buzz lightyear seleccionada !!", Toast.LENGTH_LONG).show();
            //dos?.hint = "Sugerencia";
        }
        if (tres?.isChecked == true){
            Toast.makeText(this,"Ferrari seleccionado !!", Toast.LENGTH_LONG).show();
            //dos?.hint = "Sugerencia";
        }
        if (cuatro?.isChecked == true){
            Toast.makeText(this,"Nintendo Switch OLED 64GB seleccionado !!", Toast.LENGTH_LONG).show();
            //dos?.hint = "Sugerencia";
        }
        if (cinco?.isChecked == true){
            Toast.makeText(this,"Nintendo NES Classic Edition seleccionado !!", Toast.LENGTH_LONG).show();
            //dos?.hint = "Sugerencia";
        }
        /* else{
            dos?.error = "Error";
        } */
    }
}