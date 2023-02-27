fun main() {
    val n: Int = readln().toInt()
    val nSet = mutableListOf<Int>()

    for (i in 0 until n) {
        nSet.add(readln().toInt())
    }

    val m: Int = readln().toInt()

    if (m in nSet) {
        println("YES")
    } else {
        println("NO")
    }
}