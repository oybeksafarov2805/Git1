package com.example.git.model

import java.io.Serializable

class Person(
    val full_name: String,
    val type: String,
    var money: String,
    var about: String,
    val image: String
) :Serializable{
}