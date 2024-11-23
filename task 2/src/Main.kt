//Задача 2.
//
//Создать приложение, которое подсчитывает количество различных символов во введенной строке. Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
//A - 3
//D - 2
//S - 3
fun main() {
    println("Введите строку: ")
    val input = readln()
    var chars = input.toList().distinct().sorted()
    var answer = ""
    for (char in chars) {
        answer += "$char - ${input.count { a -> a == char }}\n"
    }
    println("Результат:\n$answer")
}