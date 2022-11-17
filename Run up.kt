package com.example.animalstype

fun main() {
    println("Good Day") // Приветствие

    val herbivores = Herbivores("Cow","Horse") //Травоядные животные
    val carnivorous = Carnivorous( "Lion","Bear") //Плотоядные животные
    println(herbivores.Name)
    println(herbivores.Name2)
    println(carnivorous.type)
    println(carnivorous.Name3)
    println(carnivorous.Name4)
    print("End")

}