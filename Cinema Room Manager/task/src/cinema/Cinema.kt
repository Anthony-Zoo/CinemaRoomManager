package cinema

fun main() {
    print("Enter the number of rows: ")
    val rows: Int = readln().toInt()
    print("Enter the number of seats in each row: ")
    val seats: Int = readln().toInt()
    val totalSeats: Int = rows * seats

    val generalCost: Int = 10
    val frontCost: Int = 10
    val backCost: Int = 8


    val arrangement = createArrangement(rows, seats)
    var ticketsPurchased: Int = 0
    var currentIncome: Int = 0

    while (true) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")

        when (readln().toInt()) {
            1 -> {
                println("Cinema:")
                print("  ")

                for (i in 1..seats) {
                    print("$i ")
                }

                println()
                for (i in arrangement.indices) {
                    println("${i + 1} ${arrangement[i].joinToString(" ")}")
                }
            }
            2 -> {
                while (true) {
                    print("Enter a row number: ")
                    val rowNum: Int = readln().toInt()
                    print("Enter a seat number in that row: ")
                    val seatNum: Int = readln().toInt()

                    try {
                        if (arrangement[rowNum - 1][seatNum - 1] == "B") {
                            println("That ticket has already been purchased!")
                            continue
                        }
                    } catch (e: Exception) {
                        println("Wrong input!")
                        continue
                    }

                    val price: Int = calculatePrice(rowNum, totalSeats, rows, generalCost, frontCost, backCost)
                    println("Ticket price: $$price")

                    updateArrangement(arrangement, rowNum, seatNum)
                    ticketsPurchased++
                    currentIncome += price
                    break
                }
            }
            3 -> {
                println("Number of purchased tickets: $ticketsPurchased")

                val percentage: Double = ticketsPurchased.toDouble() / totalSeats.toDouble() * 100
                val formatPercentage: String = "%.2f".format(percentage)
                println("Percentage: $formatPercentage%")

                println("Current income: $$currentIncome")

                println("Total income: $${totalIncome(rows, seats, totalSeats, generalCost, frontCost, backCost)}")
            }
            0 -> break
        }
    }
}

fun createArrangement(rows: Int, seats: Int): MutableList<MutableList<String>> {
    val arrangeList = MutableList(rows) { mutableListOf<String>()}

    for (i in arrangeList.indices) {
            for (seat in 0 until seats) {
                arrangeList[i].add("S")
            }
    }

    return arrangeList
}

fun updateArrangement(arrangement: MutableList<MutableList<String>>, rowNum: Int, seatNum: Int) {
    arrangement[rowNum - 1][seatNum - 1] = "B"
}

fun calculatePrice(rowNum: Int,
                   totalSeats: Int,
                   rows: Int,
                   generalCost: Int,
                   frontCost: Int,
                   backCost: Int,
): Int {
    if (totalSeats <= 60) {
        return generalCost
    }

    return if (rowNum <= rows / 2) {
        frontCost
    } else {
        backCost
    }
}

fun totalIncome(rows: Int,
                seats: Int,
                totalSeats: Int,
                generalCost: Int,
                frontCost: Int,
                backCost: Int,
): Int {
    if (totalSeats <= 60) {
        return generalCost * totalSeats
    }

    val frontIncome: Int = rows / 2 * seats * frontCost
    val backIncome : Int = (rows - rows / 2) * seats * backCost
    return frontIncome + backIncome
}