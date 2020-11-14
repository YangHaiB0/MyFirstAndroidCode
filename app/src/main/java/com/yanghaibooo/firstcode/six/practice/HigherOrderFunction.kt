package com.yanghaibooo.firstcode.six.practice

import java.lang.StringBuilder

fun main() {
    val num1 = 100
    val num2 = 80

    val result1 = num1AndNumb2(num1, num2) { n1, n2 -> n1 + n2 }
    val result2 = num1AndNumb2(num1, num2) { n1, n2 -> n1 - n2 }

    println("result1 is $result1")
    println("result2 is $result2")

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().build {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result.toString())


    println("main start")
    val str = ""
    printString(str) { s ->
        println("lambda start")
        if (s.isEmpty()) return
        println(s)
        println("lambda end")
    }
    println("main end")
}

inline fun printString(string: String, block: (String) -> Unit) {
    println("----printString begin----")
    block(string)
    println("----printString  end ----")
}

inline fun runRunnable(crossinline block: () -> Unit) {
    Runnable { block() }.apply { run() }
}

inline fun num1AndNumb2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int = operation(num1, num2)

fun plus(num1: Int, num2: Int): Int = num1 + num2

fun minus(num1: Int, num2: Int): Int = num1 - num2

fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}