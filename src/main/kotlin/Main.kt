@file:JvmName("Main")

import java.io.File
import kotlin.system.measureTimeMillis

fun main() {
    println("Укажите файл или путь до файла")
    val input = readLine()!!.replace(" ", "")
    println(input)
    val time = measureTimeMillis {
        val file = File(input)
        println(ServicesProcessingFile.run(file))
    }
    println("Время выполнения  $time")
}



