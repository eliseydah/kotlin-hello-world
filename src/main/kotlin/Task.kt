class Task(val title: String, var isDone: Boolean = false) {
    fun markDown() {
        isDone = true
    }

    fun display() {
        val status = if (isDone) "[x]" else "[ ]"
        println("$status $title")
    }
}