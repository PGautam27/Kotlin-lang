package `Main codes`

fun main(args: Array<String>) {
    multiplicationBoard(2)
}

fun multiplicationBoard(size: Int){
    for(number in 1..size){
        print(" | ")
        for (otherNumber in 1..10){
            print("$number x $otherNumber = ${number * otherNumber} | ")
        }
        println()
    }
}
