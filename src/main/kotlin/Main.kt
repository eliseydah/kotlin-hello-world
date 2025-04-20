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
//fun main() {
//    val tasks = mutableListOf<Task>()
//    tasks.add(Task("Write code"))
//    tasks.add(Task("Eat a sandwich"))
//    tasks[0].markDown()
//    for (task in tasks) {
//        task.display()
//    }
//}
fun main() {
    val tasks = mutableListOf<Task>()

    while (true) {
        println(
            """
            === Меню ===
            1. Показать задачи
            2. Добавить задачу
            3. Отметить задачу выполненной
            4. Удалить задачу
            0. Выйти
        """.trimIndent()
        )

        print("Введите номер действия: ")
        when (readln()) {
            "1" -> showTasks(tasks)
            "2" -> addTask(tasks)
            "3" -> markTaskDone(tasks)
            "4" -> deleteTask(tasks)
            "0" -> {
                println("Пока 👋")
                break
            }

            else -> println("Неверная команда.")
        }
    }
}

fun showTasks(tasks: List<Task>) {
    if (tasks.isEmpty()) {
        println("List is empty")
        return
    }
    for ((i, task) in tasks.withIndex()) {
        print("$i. ")
        task.display()
    }
}

fun addTask(tasks: MutableList<Task>) {
    print("Enter the task:")
    val title = readln()
    tasks.add(Task(title))
    println("Task was added")
}

fun markTaskDone(tasks: MutableList<Task>) {
    showTasks(tasks)
    print("Enter the number of the task to mark it done")
    val index = readln().toIntOrNull()
    if (index != null && index in tasks.indices) {
        tasks[index].markDown()
        println("The task is done ")
    } else {
        println("wrong index")
    }
}

fun deleteTask(tasks: MutableList<Task>) {
    showTasks(tasks)
    print("enter the number of the task for removing")
    val index = readln().toIntOrNull()
    if (index != null && index in tasks.indices) {
        tasks.removeAt(index)
        println("the task was removed.")

    } else {
        println("wrong index.")
    }
}