package com.example.androidproject

import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.NestedScrollingParent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Objects

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val img = findViewById<ImageView>(R.id.imagen_1)
        val text = findViewById<TextView>(R.id.text_1)

        val nombre = listOf(
            "gato1", "gato2", "gato3"
        )

        val imagenes = listOf(
            R.drawable.gato1, R.drawable.gato2, R.drawable.gato3
        )

        val descripcion = listOf(
            "gato magico", "gato sentado", "gato acostado"
        )


        val adapter = ArrayAdapter(

            this, android.R.layout.simple_spinner_item, nombre
        )

        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spinner1.adapter = adapter

        spinner1.onItemSelectedListener =
            Object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?, view: View,
                    position: Int, id: Long
                ){
                    imgProducto.setImageResource(imagenes[position])
                    textView2.text = descripcion(position)
                }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart() llamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause() llamado")
    }


    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume() llamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop() llamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart() llamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy() llamado")
    }




}