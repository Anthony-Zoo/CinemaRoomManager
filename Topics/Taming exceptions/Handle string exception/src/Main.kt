fun main() {
    val index: Int = readLine()!!.toInt()
    val word: String = readLine()!!

    if (index < 0 || index >= word.length) {
        println("There isn't such an element in the given string, please fix the index!")
    } else {
        println(word[index])
    }
}