package com.example.clase_4_01092020

        fun main() {
//
//     val sumResult = calculate(10,10, ::sum)
//            println(sumResult)
//
//        val multiplicacionResult = calculate(3,4) {a,b->a*b}
//        println(multiplicacionResult)
//
//        val divisionResult = calculate(10,5) {a,b->a/b}
//        println(divisionResult)
//    }
//    fun sum(x: Int, y: Int)= x + y
//    fun mul(num1:Int, num2:Int)= num1 * num2
//
//}
//    fun calculate(x: Int, y: Int, operation: (Int,Int)-> Int): Int {
//    return operation(x,y)
//    }


            val func = operation()
            println(func(3))
}

fun operation():(Int)-> Int{
    return ::square
}

fun square( x: Int) = x * x

fun cube(x: Int,operation: (x: Int) -> Int): Int {
    return square(x) * x
}