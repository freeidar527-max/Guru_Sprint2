fun main() {
    val secretPassword = "Секретный"
    var input: String
    do {
        print("Введите пароль: ")
        input = readln()
    } while (input != secretPassword)
    println("Доступ разрешён")
}