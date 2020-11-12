package com.yanghaibooo.firstcode.two.hello_world

class Student(val sno: String = "", val grade: Int = 0, name: String = "", age: Int = 0) : Person(name, age), Study {
    override fun readBooks() {
        println("$name is reading")
    }
}