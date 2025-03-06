package lesson_2

const val SECONDS_OR_MINUTES_COUNT = 60
const val HOURS_IN_DAY = 24

fun main() {

    /* Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время
    прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
    – Создай целочисленные переменные и проинициализируй их этими данными;
    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
    – Выведи результат в консоль.*/

    val startHours: Int = 9
    val startMinutes: Int = 39
    val allMinutesTravel: Int = 457

    val hoursTravelTime = allMinutesTravel / SECONDS_OR_MINUTES_COUNT
    val minutesTravelTime = allMinutesTravel % SECONDS_OR_MINUTES_COUNT

    val endMinutes = (startMinutes + minutesTravelTime) % SECONDS_OR_MINUTES_COUNT
    val hoursFromEndMinutes = (startMinutes + minutesTravelTime) / SECONDS_OR_MINUTES_COUNT

    val endHours = (startHours + hoursTravelTime + hoursFromEndMinutes) % HOURS_IN_DAY

    val timeFormat = "%02d:%02d"

    println("Время отбытия: ${String.format(timeFormat, startHours, startMinutes)}")
    println("Время в пути: ${hoursTravelTime}ч ${minutesTravelTime}мин (${allMinutesTravel}мин)")
    println("Время прибытия: ${String.format(timeFormat, endHours, endMinutes)}")
}