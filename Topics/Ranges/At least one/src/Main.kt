fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()
    val e: Int = readln().toInt()

    println(e in a..b || e in c..d)
}