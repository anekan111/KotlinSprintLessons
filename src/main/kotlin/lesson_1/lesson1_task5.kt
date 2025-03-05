package lesson_1


const val SECONDS_OR_MINUTES_COUNT = 60

fun main() {
    /* Задача 5* к Уроку 1
    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
    - Значения часов, минут и секунд отображать двумя цифрами.*/

    val allSeconds = 6480

    val allMinutes = allSeconds / SECONDS_OR_MINUTES_COUNT
    val seconds = allSeconds % SECONDS_OR_MINUTES_COUNT
    val hours = allMinutes / SECONDS_OR_MINUTES_COUNT
    val minutes = allMinutes % SECONDS_OR_MINUTES_COUNT

    val timeFormat = "%02d:%02d:%02d"
    println("Время проведенное в космосе - ${String.format(timeFormat, hours, minutes, seconds)}")
}