package lesson_2

fun main() {
    val employeesCount = 50
    val employeeSalary: Double = 30000.0

    val internsCount = 30
    val internSalary: Double = 20000.0

    val fixedCosts = employeesCount * employeeSalary
    println("Расходы на зарплаты постоянных сотрудников - ${fixedCosts.toInt()}")

    val internsCosts = internsCount * internSalary
    val totalPayments = fixedCosts + internsCosts
    println("Общие расходы по ЗП после прихода стажеров - ${totalPayments.toInt()}")

    val allWorkerCount = employeesCount + internsCount
    val newAverageSalary = totalPayments / allWorkerCount
    println("Средняя ЗП 1-го сотрудника после устройства стажеров - ${newAverageSalary.toInt()}")
}