package `Main codes`

fun main(args: Array<String>) {
    var list = mutableListOf<Int>(1,5,3,8,5)
    val true1 = isItSorted(list)
    println("The above list is sorted or not: $true1")
    if(!true1){
        var list1 = doSorting(list)
        printSortArray(list1)
        pseudoBinarySearch(4,list1)
    }
    else{
        printSortArray(list)
        pseudoBinarySearch(4,list)
    }
}

fun isItSorted(numbers: List<Int>):Boolean{
    for (i in numbers.indices)
        for (j in i+1 until numbers.size)
            if(numbers[i]>numbers[j])
                return false
    return true
}

fun doSorting(numbers: MutableList<Int>):ArrayList<Int>{
    var newList = arrayListOf<Int>()
    var count = numbers.size-1
    for(i in numbers.indices){
        var k = if(i==numbers.size-1) i else i+1
        for(j in k until numbers.size){
            if(numbers[i]>numbers[j]) {
                count = j
                break
            }
        }
        if(count==numbers.size-1){
            newList[i] = numbers[i]
        }
        else{
            newList[i] = numbers[count]
        }
    }
    return newList
}

fun printSortArray(ListArray: MutableList<Int>){
    print("| ")
    for(i in ListArray){
        print("$i ")
    }
    print("|")
}

fun pseudoBinarySearch(value : Int,TheList : List<Int>):Boolean{
    if(TheList.isEmpty())
        return false
    val middleIndex = TheList.size/2
    if(value<=TheList[middleIndex])
        for(i in 0..middleIndex)
            if(TheList[i]==value)
                return true
    else
        for(i in middleIndex downTo TheList.size-1)
            if (TheList[i]==value)
                return true
    return false
}
