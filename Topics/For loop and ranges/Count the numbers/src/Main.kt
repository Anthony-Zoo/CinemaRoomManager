fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val n: Int = readln().toInt()

    var count: Int = 0

    for (i in a..b) {
        if (i % n == 0) {
            count++
        }
    }

    println(count)
}