@file:JvmName("Main")

import java.io.File
import kotlin.system.measureTimeMillis
import kotlin.io.*

fun main(args : Array<String>) {
    val time = measureTimeMillis {
        if (args.isEmpty()) {
           return println("Передайте путь к файлу первым аргументом")
        }
        val file = File(args[0])
        println(ServicesProcessingFile.run(file))
    }
    println("Время выполнения  $time мс")
}



