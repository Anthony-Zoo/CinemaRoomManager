fun main() {
    val input: String = readln()

    var unique: Int = 0

    for (letter in input) {
        var count: Int = 0

        for (compare in input) {
            if (letter == compare) {
                count++
            }
        }

        if (count > 1) {
            continue
        }

        unique++
    }

    println(unique)
}