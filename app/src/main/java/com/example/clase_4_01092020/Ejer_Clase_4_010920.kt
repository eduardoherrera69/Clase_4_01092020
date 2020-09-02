package com.example.clase_4_01092020

import android.accounts.Account
//
//
//const val POINTS_X_PASS: Int = 15
//val eZPassAccount: MutableMap<Int,Int> =
//    mutableMapOf(10 to 200, 2 to 200, 30 to 300)
//
//val ejemMap: MutableMap<String, Int> =
//    mutableMapOf("clave1" to 100, "clave2" to 300)
//
//val ezPassReport: Map<Int, Int> = eZPassAccount
//
//fun updatePointsCredit(accountID: Int) {
//
//    if (eZPassAccount.containsKey(accountID)){
//        println("si la contiene")
//        eZPassAccount[accountID] = 1000
//
//
//    } else {
//        println("no existe la clave")
//    }
//
//
//}

fun main() {
/*
    val upperCase1: (String) -> String = { str: String -> str.toUpperCase()}

        val upperCase2: (String) -> String = { string -> str.toUpperCase()}

            val upperCase3 ={ str: String -> str.toUpperCase()  }
  */
//
//    val systemUsers: MutableList<Int> = mutableListOf(1,2,3,4)
//
//    val onlyReadList: List<Int> = systemUsers
//
//    systemUsers.add(3)
//    systemUsers.add(8)
//    systemUsers.remove(3)
//    systemUsers.removeAt(3)// borra por indice
//    systemUsers.remove(9)// borra por elemento
//    systemUsers [2] = 7
//    //
//    println(systemUsers)
//    println(onlyReadList)
//
//    fun addListInmutable(newint: Int) {
//        systemUser.add(newint)
//}
//fun getList(): List<Int> {
//    return onlyReadList
//
//}
//   // println("Tamano de la lista es: " ${onlyReadList.size}")
//    //println("Tamano de la lista es: " ${systemUsers.size}")
//
//    systemUsers.forEach(){
//        i -> println("Este es el elemento $i")
//    }
//
//===================
//    val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1"
//    "uniqueDescr2"
//    "uniqueDescr3"
//    "uniqueDescr1"
//    "uniqueDescr5")
//
//    println(openIssues.size)
//    println(openIssues)
//
//    fun addIssue(uniqueDesc: String): Boolean{
//        return openIssues.add(uniqueDesc)
//    }
//
//   println(addIssue("uniqueDescr3"))
//    println(addIssue("uniqueDescr9"))
//
//updatePointsCredit(10)
//    println(eZPassAccount)

//    val numbers = listOf(1,-2,3,-4,5,6)
//    val positives = numbers.filter { num -> num>0 }
//    val negative = numbers.filter { it <0 }
//    println(positives)
//    println(negative)

//
//    val numbers = listOf(1,-2,3,-4,5,6)
//val double = numbers.map { x -> x * 2 }
//    val tripled = numbers.map { it * 3 }
//
//    println(double)
//    println(tripled)

// val numbers = listOf(1,-2,3,-4,5,6)
//    val anyNegative = numbers.any { it < 0 }
//  val anyGTG = numbers.any { it >= 6 }
////  val allEven = numbers.all { it % 2 == 0 }
////    val allLess6 = numbers.all { it < 6}
//    val allEven = numbers.none() { it % 2 == 1 }
//    val allLess6 = numbers.none() { it > 0 }
//
//
//    println(anyNegative)
//    println(anyGTG)
//    println(allEven)
//    println(allLess6)

//    val words = listOf("Lets","find", "something", "in", "someHow")
//    val first = words.find { it.startsWith("some") }
//    val last = words


//
// val numbers = listOf(10, 9, 1,-2,23,3,-4,5,6)
//    val words = listOf("Lets","find", "something", "in", "someHow")
//
//    val naturalOrden = numbers.sorted()
//    val inverted = numbers.sortedBy { -it }
//    println(naturalOrden)
//    println(inverted)
//
    val list:MutableList<Libro> = mutableListOf(
        Libro("algo", )
    )



 }

data class Libro(val name: String,
                 val isbn: String,
                 val pages: Int,
                 val price: Double,
                 val author: String,
                 val publishYear: Int,
                 val editorial: String,
                 val type: Char)