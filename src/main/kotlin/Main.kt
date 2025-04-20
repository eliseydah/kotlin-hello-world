//fun main() {
//    println("Введите свой возраст:")
//    val ageInput = readln()
//    val age = ageInput.toIntOrNull()
//    if (age != null) {
//        println("через год вам будет ${age + 1}")
//    } else {
//        println("Пожалуйста, введите корректное число.")
//    }
//}
fun main () {
    println("Введите свое имя:")
    val name = readln()
    repeat(5){
        println("Hello $name")
    }
}