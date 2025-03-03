package lesson_1

fun main() {

    /* В любом учебнике есть задачи про космос. Объяви переменные и выведи данные о полете в космос первого человека.
       – Запиши в новую переменную year год полета Юрия Гагарина в космос;
       – Объяви и проинициализируй переменные hour и minute – час и минуту взлета соответственно;
       – Выведи год, час и минуту взлета по одной переменной на каждую строку;
       – Затем измени значения переменных hour и minute, чтобы они теперь имели значение часа и минуты посадки;
       – Выведи время посадки в одной строке в формате [часы:минуты]. Пример: 10:55.

        Определи, где в программе переменные должны задаваться через val, а где через var.
        Данные для задачи:
        Год полета – 1961
        Взлет – 09:07
        Посадка – 10:55 */

    println("lesson1 task3\n")

    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(year)
    println(hour)
    println(minute)

    val timeFormat = "%02d:%02d"
    val startTime = String.format(timeFormat, hour, minute)
    hour = 10
    minute = 55
    val landingTime = String.format(timeFormat, hour, minute)

    println("Год полета – $year")
    println("Взлет – $startTime")
    println("Посадка – $landingTime")
}

