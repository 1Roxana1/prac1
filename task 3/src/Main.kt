//Задача 3.
//
//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
fun main() {
    print("Число в 10-ичной системе -> ")
    val number = readln().toIntOrNull() ?: 0
    println("Число в двоичной системе: ${number.toString(2)}")
}