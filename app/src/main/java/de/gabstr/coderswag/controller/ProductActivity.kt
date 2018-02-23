package de.gabstr.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import de.gabstr.coderswag.utilities.EXTRA_PRODUCT
import de.gabstr.coderswag.R
import de.gabstr.coderswag.model.Product
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var product : Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productImage?.setImageResource(resourceId)
        productName?.text = product.title
        productPrice?.text = product.price
        productDescription?.text = product.description
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PRODUCT, product)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null) {
            product = savedInstanceState.getParcelable(EXTRA_PRODUCT)
        }
    }
}
