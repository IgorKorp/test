@file:JvmName("Main")

import java.io.File
import kotlin.system.measureTimeMillis
import kotlin.io.*

fun main(args : Array<String>) {
    val time = measureTimeMillis {
        val file = File(args[0])
        println("Количество уникальных ip ${ServicesProcessingFile.run(file)}")
    }
    println("Время выполнения  $time")
}



