package exemples

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.system.exitProcess

fun main() {
    showMenu()
}

fun showMenu() {
    selectAll()
    val s = "Opciones"
    println(" ")
    println(s)
    println("-".repeat(s.length))
    println("0- Exit")
    println("1- Create")
    println("2- Select")
    println("3- Update")
    println("4- Insert")
    println("5- Delete")
    println("6- DeleteAll")

    introduceNumber()
}

private fun introduceNumber() {
    println(" ")
    println("Introdueix un numero (0 per acabar): ")
    val input = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val num = input.toIntOrNull()
    if (num != null) {
        loopNumbers(num)
    } else {
        println("Entrada no valida. Introduix un numero válid.")
        println("")
        showMenu()
    }
}

fun loopNumbers(number: Int) {
    when (number) {
        0 -> {
            exitProcess(0)
        }
        1 -> {
            create()
            showMenu()
        }
        2 -> {
            showMenu()
        }
        3 -> {
            update()
            showMenu()
        }
        4 -> {
            insert()
            showMenu()
        }
        5 -> {
            delete()
            showMenu()
        }
        6 -> {
            deleteAll()
            showMenu()
        }
        else -> {
            println("Numero incorrecto")
            showMenu()
        }
    }
}