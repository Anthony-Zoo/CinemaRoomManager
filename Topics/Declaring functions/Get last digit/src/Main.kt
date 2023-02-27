fun getLastDigit(a: Int):Int {
    if (a < 0 ) {
        return a * -1 % 10
    } else {
        return a % 10
    }
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}