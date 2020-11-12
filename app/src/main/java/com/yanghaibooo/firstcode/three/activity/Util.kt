package com.yanghaibooo.firstcode.three.activity

class Util {
    // 必须有 Util 实例才能嗲用
    fun doAction1() {
        println("do action1")
    }

    // 加上注解 变成真正的 静态方法
    // 注解只能加载 单例类或者 companion object 方法上
    companion object {
        @JvmStatic
        fun doAction2() {
            println("do action2")
        }
    }
}
// 单例类 UtilBack.doAction1() 调用
object UtilBack {
    fun doAction1() {
        println("do action1")
    }
}