package de.gabstr.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import de.gabstr.coderswag.R
import de.gabstr.coderswag.adapters.CategoryAdapter
import de.gabstr.coderswag.model.Category
import de.gabstr.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var adapter: ArrayAdapter<Category>
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,
//                DataService.categories)
        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter;
    }
}
