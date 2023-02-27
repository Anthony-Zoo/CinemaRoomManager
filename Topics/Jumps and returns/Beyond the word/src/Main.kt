fun main() {
    val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
    val input: String = readln()

    for (letter in alphabet) {
        if (letter in input) {
            continue
        }

        print(letter)
    }
}