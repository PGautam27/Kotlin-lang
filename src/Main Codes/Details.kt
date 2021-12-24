fun main(args: Array<String>) {
    data class Details(var first_name: String, var Last_name : String, var age: Int,var status: String?=null)
    var d1 = Details("Gautam","P",20)
    var d2 = Details("Pritam","P",11)
    var d3 = Details("Shradha","kapoor",35)

    var arrayList1 : ArrayList<Details> = arrayListOf(d1,d2,d3)
    for(i in arrayList1){
        if(i.age in 1..18){
            i.status = "Kid"
        }
        else if(i.age in 19..30){
            i.status = "Adult"
        }
        else{
            i.status = "Old Aged"
        }
    }
    for(i in arrayList1){
        println("${i.status}")
    }
}
