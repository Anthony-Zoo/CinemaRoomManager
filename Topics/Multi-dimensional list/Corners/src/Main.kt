fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }

    println("${inputList[0][0]} ${inputList[0].last()}")
    println("${inputList[inputList.lastIndex][0]} ${inputList[inputList.lastIndex].last()}")
}