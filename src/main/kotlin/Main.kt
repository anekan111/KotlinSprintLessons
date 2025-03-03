package org.example

fun main() {

    println("Урок 1. Переменные")

    // Переменные как будто бы для приожения доставки еды
    var numberOfOrder: Int = 42
    val welcomeMessage = "Welcome to our app!"

    println(numberOfOrder)
    println(welcomeMessage)

    numberOfOrder = 52
    println(numberOfOrder)

    // const val - константа на уровне компиляции, т.е. переменные которые не изменяются
    // во время выполнения программы и доступны из разных частей кода
    // (пример url внутри приложения или версия чего-либо)


    // Типы данных в Kotlin (базовые)

    // целочисленные (min и max значения диапазона)
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit, входит 0

    val shortNum1: Short = -32768 // 16 bit
    val shortNum2: Short = 32767 // 16 bit

    val byteNum1: Byte = -128 // 8 bit
    val byteNum2: Byte = 127 // 8 bit

    // 	-9,223,372,036,854,775,808(-2^63)	9,223,372,036,854,775,807(2^63 - 1)
    val longNum: Long = 18L // 64 bit, для очень больших чисел, при инициализации добавляется L

    // для хранения только положительных значений
    val unsignedIntNum: UInt = 2147483647u // 32 bit
    val unsignedLongNum: ULong = 9223372036854775807u // 64 bit


    // вещественные (с плавающей точкой)
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 876.3f // 32 bit, для явного указания типа float добавить f в конце

    // строковые и символьные
    val stringValue: String = "this is string"
    val charValue: Char = '5'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
 }