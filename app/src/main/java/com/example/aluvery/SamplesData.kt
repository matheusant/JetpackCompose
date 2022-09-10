package com.example.aluvery

import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleDataLunchs = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("16.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("22.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Fritas",
        price = BigDecimal("6.99"),
        image = R.drawable.fries
    )
)

val sampleDataDrinks = listOf(
    Product(
        name = "Água",
        price = BigDecimal("1.99"),
        image = R.drawable.placeholder
    ),
    Product(
        name = "Coca Cola",
        price = BigDecimal("10.99"),
        image = R.drawable.ic_launcher_foreground
    ),
)

val sampleDataProducts = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("16.99"),
        image = R.drawable.ic_launcher_background
    )
)