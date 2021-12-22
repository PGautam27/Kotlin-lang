package games

import java.util.*;
fun main(args: Array<String>){
    val number = Random().nextInt(101)
    var input : String?
    var guess = -1
    while (guess !=number){
        print("Enter any no. between 1 to 100 :")
        input = readLine()
        if(input !=null){
            guess = input.toInt()
            if(guess>number){
                println("sorry dude it's larger than the number")
            }
            else if(guess<number){
                println("Sorry dude it's lesser than the number")
            }
            else{
                println("Cool dude, you just won the guess game")
                guess = number
            }
        }
        else{
            println("Yo write something don't leave it blank")
        }


    }
}