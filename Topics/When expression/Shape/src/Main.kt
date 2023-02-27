fun main(args: Array<String>) {

    val shape: String? = when (readln().toInt()) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        4 -> "rhombus"
        else -> null
    }

    println(if (shape != null) {
        "You have chosen a $shape"
    } else {
        "There is no such shape!"
    })
}