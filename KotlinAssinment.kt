package com.example.assinment1instant

fun main(){
    val num= readln().toInt()
    val num2= readln().toDouble()
    println("the result of divided is "+num2/num)
    println("the remainder is "+num%3)
    if (num2>num) println(num2) else println(num)
    if (num > 5 && num2>5) true else false
    if (num > 5 || num2>5) true else false

    println("Please enter your email address:")
    val email = readln()

    if (isValidEmail(email)) {
        println("You entered a valid email address: $email")
    } else {
        println("Invalid email address entered.")
    }
}

fun isValidEmail(email: String): Boolean {
    val emailRegex = "^[A-Za-z0-9]+@[A-Za-z.]+$".toRegex()
    return emailRegex.matches(email)
}
