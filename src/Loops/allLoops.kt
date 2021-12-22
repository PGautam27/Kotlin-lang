package Loops

fun main(args: Array<String>) {
    outer@ for (i in 1..10){
        for (j in 10 downTo 1){
            if(j-i <0){
                break@outer
            }
            println("$j - $i")
        }
    }
    print("bro write any no: ")
    val k: String? = readLine()
    val s: String = loop1(k!!.toInt())
}
fun loop1(i:Int):String{
    when(i){
        1 -> return "hi bob"
        2 -> return "you arent from here are you"
        3 -> return "Whats your mother Tongue"
        else->
            return "bye bro"
    }
}
fun <T> loop2(i: ArrayList<T>){
    for((index,value) in i.withIndex()){
        print("$index element is $value")
    }
}

fun loop3(){
    println("let me show you sum of first 100 no.")
    var flag = true
    var sum = 0
    var i = 1
    while(flag){
        sum = sum +i
        ++i
        if(i==100){
            flag=false
        }
    }
    print(sum)
}
