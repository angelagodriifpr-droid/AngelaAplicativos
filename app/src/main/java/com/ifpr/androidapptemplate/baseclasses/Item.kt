package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var endereco: String? = null,
    var fruta: String? = null,
    var quantidade: String? = null,
    var nome: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
