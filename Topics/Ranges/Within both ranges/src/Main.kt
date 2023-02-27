fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val firstRange: IntRange = a..b

    val c: Int = readln().toInt()
    val d: Int = readln().toInt()
    val secondRange: IntRange = c..d

    val sample: Int = readln().toInt()

    println(sample in firstRange && sample in secondRange)

}