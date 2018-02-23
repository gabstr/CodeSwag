package de.gabstr.coderswag.services

import de.gabstr.coderswag.model.Category
import de.gabstr.coderswag.model.Product

object DataService {

    val categories = listOf(
            Category("SHIRT", "shirtimage")
            , Category("HOODIES", "hoodieimage")
            , Category("HATS", "hatimage")
            , Category("DIGITAL", "digitalgoodsimage")

            ,Category("SHIRT", "shirtimage")
            , Category("HOODIES", "hoodieimage")
            , Category("HATS", "hatimage")
            , Category("DIGITAL", "digitalgoodsimage")
            ,Category("SHIRT", "shirtimage")
            , Category("HOODIES", "hoodieimage")
            , Category("HATS", "hatimage")
            , Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1", "bla, bla blabla bla bluc")
            , Product("Devslopes Hat Black", "$20", "hat2", "bla, bla blabla bla bluc")
            , Product("Devslopes Hat White", "$18", "hat3", "bla, bla blabla bla bluc")
            , Product("Devslopes Hat Snapback", "$18", "hat4", "bla, bla blabla bla bluc")

    ,Product("Devslopes Graphic Beanie", "$18", "hat1", "bla, bla blabla bla bluc")
            , Product("Devslopes Hat Black", "$20", "hat2", "bla, bla blabla bla bluc")
            , Product("Devslopes Hat White", "$18", "hat3", "bla, bla blabla bla bluc")
            , Product("Devslopes Hat Snapback", "$18", "hat4", "bla, bla blabla bla bluc")

    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1", "bla, bla blabla bla bluc")
            , Product("Devslopes Hoodie Red", "$30", "hoodie2", "bla, bla blabla bla bluc")
            , Product("Devslopes Gray Hoodie", "$28", "hoodie3", "bla, bla blabla bla bluc")
            , Product("Devslopes Black Hoodie", "$28", "hoodie4", "bla, bla blabla bla bluc")

    ,Product("Devslopes Hoodie Gray", "$28", "hoodie1", "bla, bla blabla bla bluc")
            , Product("Devslopes Hoodie Red", "$30", "hoodie2", "bla, bla blabla bla bluc")
            , Product("Devslopes Gray Hoodie", "$28", "hoodie3", "bla, bla blabla bla bluc")
            , Product("Devslopes Black Hoodie", "$28", "hoodie4", "bla, bla blabla bla bluc")

    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1", "bla, bla blabla bla bluc")
            , Product("Devslopes Badge Light Gray", "$20", "shirt2", "bla, bla blabla bla bluc")
            , Product("Devslopes Logo Shirt Red", "$22", "shirt3", "bla, bla blabla bla bluc")
            , Product("Devslopes Hustle", "$22", "shirt4", "bla, bla blabla bla bluc")
            , Product("Kickflip Studios", "$18", "shirt5", "bla, bla blabla bla bluc")

    ,Product("Devslopes Shirt Black", "$18", "shirt1", "bla, bla blabla bla bluc")
            , Product("Devslopes Badge Light Gray", "$20", "shirt2", "bla, bla blabla bla bluc")
            , Product("Devslopes Logo Shirt Red", "$22", "shirt3", "bla, bla blabla bla bluc")
            , Product("Devslopes Hustle", "$22", "shirt4", "bla, bla blabla bla bluc")
            , Product("Kickflip Studios", "$18", "shirt5", "bla, bla blabla bla bluc")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRT" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}
