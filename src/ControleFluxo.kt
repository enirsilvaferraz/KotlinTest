
package com.test

import sun.plugin2.gluegen.runtime.BufferFactory.getArray

fun main(args: Array<String>) {

    /**
     * CONDICIONAL IF
     */

    // Forma tradicional
    var a = 1
    var b = 2

    if (a < b) {
        println("a < b")
    } else if (a == b) {
        println("a = b")
    } else {
        println("a > b")
    }

    // Como expressao
    var c = if (a > b) a else b

    // Com blocos
    var d = if (a > b) {
        println("a > b")
        a
    } else {
        println("a <= b")
        b
    }


    /**
     * WHEN
     */

    var array = 16..20
    var x: Int = 17

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4, 5 -> println("x == 3 or x == 4")
        in 5..10 -> println("between 5 and 10")
        !in 0..50 -> println("not in 0 and 50")
        in array -> println("between 16 and 20")
        getInt() -> println("in custom method")
        else -> {
            println("x is not between 1 and 10")
        }
    }

    fun getInt (): Int {
        return 11
    }

    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    when {
        validade() -> print("true")
        else -> print("false")
    }

    /**
     * LOOP FOR
     */


    var collection = intArrayOf(1, 2, 3)
    for (item in collection) println(item)


    for (item:Int in collection){
        println(item)
    }

    for (index in collection.indices) {
        println(collection[index])
    }

    for ((index, value) in collection.withIndex()){
        println("the element at $index is $value")
    }

    /**
     * LOOP WHILE e DO WHILE
     */

    while (true){
        println("WHILE")
    }

    do {
        println("DO WHILE")
    } while (true)
}

fun getInt (): Int {
    return 11
}

fun validade ():Boolean {
    return false
}
