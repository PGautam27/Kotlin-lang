package `reading files`

import java.io.*

fun main(args: Array<String>) {
    var liNo = 0
    File("C:\\Users\\Gautam\\IdeaProjects\\kotlin\\src\\gautam").forEachLine{
        ++liNo
        println("#$liNo : $it")
    }
}
