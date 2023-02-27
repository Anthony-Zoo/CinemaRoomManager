fun main() {
    val s1: String = readln()
    val op: String = readln()
    val s2: String = readln()

    when (op) {
        "equals" ->  println(s1 == s2)
        "plus" -> println(s1 + s2)
        "endsWith" -> println(s1.endsWith(s2))
        else -> println("Unknown operation")
    }
}