package de.gabstr.coderswag.adapters

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import de.gabstr.coderswag.R
import de.gabstr.coderswag.controller.ProductActivity
import de.gabstr.coderswag.model.Product
import de.gabstr.coderswag.utilities.EXTRA_PRODUCT

class ProductsAdapter(val context: Context, val products: List<Product>)
                                : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        var product = products[position]
        holder?.bindProduct(product, context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price

            itemView.setOnClickListener(View.OnClickListener {
                if(product.title != "") {
                    val productActivity = Intent(context, ProductActivity::class.java)
                    productActivity.putExtra(EXTRA_PRODUCT, product)
                    context.startActivity(productActivity)
                } else {
                    Toast.makeText(context, "Please select a product", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

}
