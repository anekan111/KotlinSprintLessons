package lesson_1

fun main() {
    /* Задача 5* к Уроку 1
    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
    - Значения часов, минут и секунд отображать двумя цифрами.*/

    println("lesson1 task5\n")

    val allSeconds = 6480

    val allMinutes = allSeconds / 60
    val seconds = allSeconds % 60
    val hours = allMinutes / 60
    val minutes = allMinutes % 60

    //println("Общее кол-во минут - $allMinutes")
    //println("Секунды - $seconds")
    //println("Часы - $hours")
    //println("Минуты - $minutes")

    val timeFormat = "%02d:%02d:%02d"
    println("Время проведенное в космосе - ${String.format(timeFormat, hours, minutes, seconds)}")
}

