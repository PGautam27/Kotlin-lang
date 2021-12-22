package games

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val name = readLine()
    if(name==null){
        println("Hey dude you didn't give any word to guess")
        return
    }
    for(i in 1..50)
        println()
    val letters = name.lowercase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses){
        nice(name,correctGuesses)
        println("\n#wrong guesses: $fails")

        print("guess the letter: ")
        val input = readLine()

        if(input == null){
            continue
        }
        else if(input.length !=1){
            println("Please enter one letter")
            continue
        }
        if (name.lowercase().contains(input.lowercase()))
            correctGuesses.add(input[0].lowercaseChar())
        else{
            ++fails
        }
    }
    nice(name, correctGuesses)
    println("\n#Wrong guesses: $fails \n\n")
    println("Well done")

}
fun nice(word: String, goodGuess: Set<Char>){
    for(ele in word.lowercase()){
        if(goodGuess.contains(ele))
            print("$ele ")
        else
            print("_ ")
    }
}
