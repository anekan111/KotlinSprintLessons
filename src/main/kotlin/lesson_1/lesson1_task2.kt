package lesson_1

fun main() {

    /* Скопируй решение из задачи 1 в новый файл с задачей 2. Теперь необходимо дописать реализацию программы
       для новых целей. Имитируем логи с сервера.
       – Для начала выведи в консоль значения всех объявленных ранее переменных;
       – Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000).
       Подбери подходящее наименование переменной, присвой ей значение и распечатай;
       – Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества работников,
       присвой новое значение количества работников этой переменной и распечатай в консоль. */

    print("lesson1 task2\n\n")

    val ordersCount: Int = 75
    val thanksMessage: String = "Спасибо, что покупаете у нас! Ваш дружелюбный интернет-магазин."

    println("Количество заказов: $ordersCount")
    println(thanksMessage)

    var employeesCount: Int = 2000
    //println("Количество работников: $employeesCount")

    employeesCount = 1999
    println("Количество работников: $employeesCount")

}

