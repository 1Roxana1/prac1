//Задача 4.
//
//Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат. Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными. Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ
fun main() {
    print("Введите строку (2 числа и оператор через пробел) -> ")
    val input = readln().split(' ')
    if (input.count() != 3) {
        println("Неверный ввод")
        return
    }
    val first = input[0].toDoubleOrNull()
    val second = input[1].toDoubleOrNull()
    if (first == null || second == null) {
        println("Неверный ввод")
        return
    }
    val operation = input[2]
    when (operation) {
        "+" -> println("Результат: ${first + second}")
        "-" -> println("Результат: ${first - second}")
        "/" -> println("Результат: ${first / second}")
        "*" -> println("Результат: ${first * second}")
        else -> {
            println("Неверный ввод")
            return
        }
    }
}