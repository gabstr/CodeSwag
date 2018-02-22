package de.gabstr.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import de.gabstr.coderswag.EXTRA_CATEGORY
import de.gabstr.coderswag.R

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
