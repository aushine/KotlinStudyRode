import kotlin.math.max


/*
fun maxOf(a:Int,b:Int):Int{
    if (a > b){
        return a
    }else{
        return b
    }
}
        */
fun maxOf(a:Int, b:Int) = if (a>b) a else b
fun parseInt(str:String): Int?{
    return str.toIntOrNull()

}
fun printProduct(arg1:String, arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x != null && y != null){
        println(x*y)
    }else{
        println("either '$arg1' or '$arg2' is not a number")
    }
}
fun getStringLength(obj:Any):Int?{
    if(obj is String){
        return obj.length
}
return null
}
fun describe(obj: Any): String =
        when(obj){
            1  ->"One"
            2  ->"Greeting"
            is Long -> "Not a string"
            else -> "UnKnown"
        }
fun main(arg: Array<String>){
    val items = listOf("apple","banana","apple")
    val list = listOf("a", "b", "c")
    val fruits = listOf("banana","pear","strawberry","cherry")
    fruits
        .filter{it.startsWith("a")}
        .sortedBy{it}
        .map{it.toUpperCase()}
        .forEach{println(it)}
    println("The list indices is ${list.indices}")
    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if(list.size !in list.indices){
        print("list size is out of valid list indices rang too")
    }

    val x = 10
    val y = 9
    if (x in 1..y+1){
        println("fits in range")
    }

    println(describe(1))

    var a = 1
    val s1 = "a is ${a}"
    a = 2
    val s2 = "${s1.replace("is","was")} but now is $a"
    println(s2)

    println("max of 0 and 43 is ${maxOf(0, 43)}")

    printProduct("123","2")

    fun printLength(obj:Any){
        println("'$obj' string length is ${getStringLength(obj)?:"error,not a string"}")
    }
    printLength("Yea Sakura my Wife")
    printLength(1000)
    printLength(listOf(Any()))
}