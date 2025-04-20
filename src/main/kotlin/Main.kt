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
//fun main () {
//    println("Введите свое имя:")
//    val name = readln()
//    repeat(5){
//        println("Hello $name")
//    }
//}
//fun main() {
//    val tasks = mutableListOf<String>()
//    tasks.add("Clean your teeth")
//    tasks.add("Cook a breakfast")
//    for ((index, task) in tasks.withIndex()) {
//        println("$index. $task")
//    }
//    tasks.removeAt(1)
//    for ((index, task) in tasks.withIndex()) {
//        println("$index. $task")
//    }
//}
fun main() {
    val tasks = mutableListOf<Task>()
    tasks.add(Task("Write code"))
    tasks.add(Task("Eat a sandwich"))
    tasks[0].markDown()
    for (task in tasks) {
        task.display()
    }
}