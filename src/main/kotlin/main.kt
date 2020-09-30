fun main(args: Array<String>) {
//    val scan = java.util.Scanner(System.`in`)
    val n: Int

    if (args[0].trim().all{ it.isDigit() }) {
        n = args[0].trim().toInt()
    } else {
        println("enter is wrong")
        return
    }

    if (n < 1) {
        println("n is not valid")
    } else {
        printFibonacci(n)
    }

}

fun printFibonacci(n: Int): MutableList<Int> {
    val fibSec = mutableListOf<Int>()

    fibSec.add(0)
    fibSec.add(1)
    fibSec.add(1)

    for (i in 0..2) {
        println(fibSec[i])
    }

    for (i in 3 until n) {
        fibSec.add(fibSec[i - 1] + fibSec[i - 2])
        println(fibSec[i])
    }

    return fibSec

}