package com.example.imagenesarraadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Código para descargar img de url
        val url1 = "https://images.unsplash.com/photo-1506585706431-9d7b4697def8?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"
        val img = findViewById<ImageView>(R.id.MiImageView)
        Picasso.get().load(url1).into(img)
        //Fin

        val url2 = "https://images.unsplash.com/photo-1597025144899-04f87adf113b?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=675&q=80"
        val url3 = "https://images.unsplash.com/photo-1490644658840-3f2e3f8c5625?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"

        val listaImagenes = listOf("cielo", "desierto", "ciudad")
        val lvImagenes = findViewById<ListView>(R.id.miListView)
        lvImagenes.adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listaImagenes)

        lvImagenes.setOnItemClickListener{parent, view, position, id ->
            //Toast.makeText(this, listaImagenes[position], Toast.LENGTH_SHORT).show()
            if(listaImagenes[position] == "cielo") {
            Picasso.get().load(url1).into(img)
            }
            else if(listaImagenes[position] == "desierto") {
                Picasso.get().load(url2).into(img)
            }
            else if(listaImagenes[position] == "ciudad") {
                Picasso.get().load(url3).into(img)
            }
        }
    }
}