package de.gabstr.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import de.gabstr.coderswag.R
import de.gabstr.coderswag.adapters.CategoryAdapter
import de.gabstr.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter;

        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title}", Toast.LENGTH_SHORT).show()
        }
    }
}
