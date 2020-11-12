package com.yanghaibooo.firstcode.four.ui_best_practice

// 密封类
sealed class Result

class Success(val msg: String) : Result()

class Failure(val error: Exception) : Result()

// 当 when 语句中是密封类时 会检查有哪些类 并要求强制实现
fun getResultMsg(result: Result) = when (result) {
    is Success -> result.msg
    is Failure -> "Error is ${result.error.message}"
}