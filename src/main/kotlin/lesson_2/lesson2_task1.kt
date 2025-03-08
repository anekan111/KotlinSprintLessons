package lesson_2

fun main() {

    val studentsCount = 4
    val grade1: Float = 3f
    val grade2: Float = 4f
    val grade3: Float = 3f
    val grade4: Float = 5f

    val averageScore: Float = (grade1 + grade2 + grade3 + grade4) / studentsCount
    val formattedResult = String.format("%.2f", averageScore)

    println("Cредний балл - $formattedResult")
}