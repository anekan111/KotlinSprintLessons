package lesson_2

fun main() {

    /* В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым
    назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
    – Расходы на выплату зарплаты постоянных сотрудников;
    – Общие расходы по ЗП после прихода стажеров;
    – Среднюю ЗП одного сотрудника после устройства стажеров.
    Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде
    целых чисел.*/

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