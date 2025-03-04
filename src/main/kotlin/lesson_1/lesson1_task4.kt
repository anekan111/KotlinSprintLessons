package lesson_1

fun main() {

    /* Запиши в переменные соответствующие значения, явно указывая их тип. Для всех переменных выбирай тип данных,
       занимающий наименьшее возможное место в памяти, при этом вмещающий нужное значение (например для числа 0
       выбирай тип Byte и так далее).
       Список переменных:
       – length – расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
       – age – возраст Гагарина на момент полета (целых лет);
       – partOfDay – какую часть дня Гагарин провел в космосе;
       – seconds – количество секунд которое Гагарин провел в космосе;
       – partOfYear – какую часть года Гагарин провел в космосе;
       – apogee – апогей орбиты Гагарина в метрах.

        И выведи все эти переменные в столбик (каждая с новой строки). Данные для задачи:
        Расстояние 40_868_600_000
        Возраст – 27
        Часть дня – 0.075
        Секунды – 6480
        Часть года – 2.0547945205479453E-4
        Апогей орбиты – 327000 */

    println("lesson1 task4\n")

    val length: String = "40_868_600_000"
    val age: UByte = 27u
    val partOfDay: Float = 0.075f
    val seconds: UShort = 6480u
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: UInt = 327000u

    println("Расстояние $length")
    println("Возраст - $age")
    println("Часть дня – $partOfDay")
    println("Секунды – $seconds")
    println("Часть года – $partOfYear")
    println("Апогей орбиты – $apogee")
}