package lesson_2

fun main() {

    /* Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
       У них следующие баллы по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает
       средний балл по английскому для этого класса.
       – Написать выражение, которое высчитывает средний балл;
       – Распечатать результат в консоль;
       – В консоли должно быть выведено дробное число с 2 знаками после запятой.*/

    val studentsCount = 4
    val grade1: Float = 3f
    val grade2: Float = 4f
    val grade3: Float = 3f
    val grade4: Float = 5f

    val averageScore: Float = (grade1 + grade2 + grade3 + grade4) / studentsCount
    val formattedResult = String.format("%.2f", averageScore)

    println("Cредний балл - $formattedResult")
}