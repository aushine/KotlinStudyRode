import java.io.File
import java.lang.ArithmeticException
import java.lang.IllegalStateException

fun test_1(){
    var list1 = listOf(1, 2, 3, 4, 5, 6, -1, -2, -3)
    list1 = list1.filter{it>0}
    println(list1)
}

fun Int.toString_(x:Int):String{
    return x.toString()  //给Int类型创建的扩展函数
}
fun monkey():Int{
    var y = 0
    var j = 1
    var x = 0
    while(y !=6){
        x = j * 4
        for (i in 1..5){
            if(x % 4 !=0){
               break
            }else{
                y = i + 1
                x = (x / 4) * 5 + 1
            }
        }
    j += 1
    }
    return x

}
fun ffjp(n:Int):Any{
    var n = n
    var f = mutableListOf(1)
    for (i in 1..(n/2)) {
        for (j in 2..n) {
            if (n % j == 0) {
                f.add(j)
                n /= j
                break
            }
        }

    }
return f
}
fun transform(color:String):Int{
    return when (color){
        "red"->0
        "green"->1
        "blue"->2
        else -> throw IllegalStateException("Color Error")
    }
}
fun count(){


}
fun Test0(){
    val result = try{
        count()
    }catch(e:ArithmeticException){
        throw IllegalStateException("fuckingcrazey?")
    }
}
fun foo(param:Int) {
    val result = if (param == 1) {
        "eins"
    } else if (param == 2){
        "zwei"
    }else{
        "drei"
    }
}

fun main(args:Array<String>){
    //println(transform("white"))
    var data = mutableMapOf("email" to null)
    //val email = data["email"] ?: throw IllegalStateException("Email is missing!")
    data?.let{
        println("HelloWorld")//不为空值的时候将会执行let后的语句
    }
    //println(ffjp(1564))
    //println(monkey())
    val files = File("Test").listFiles()
    println(files?.size)
    var Int1 = 2
    println(Int1.toString_(Int1))
    var str1 = "crazyfucking "
    str1 = str1.plus("marie rose")
    println(str1)
    val lambda_:(str:String)->Any = {x ->x.toUpperCase()}
    val fruits = listOf("banana","cherry","strawberry","pear","apple")
    fruits
        //.filter {it.startsWith("a")}
        .sortedBy {it[0]}
        .map {lambda_(it)}
        .forEach{ println(it) }
    val list1 = listOf("a", "b", "c")
    val list2 = listOf(1, 2, 3)
    val map1 = mutableMapOf("f" to 4)
    map1["f"] = 1
    map1.remove("f")
    for (i in list1)
        map1[i] = list2[list1.indexOf(i)]
    for ((k,v) in map1)
        println("'$k'-->'$v'")
    val map = linkedMapOf("eins" to 1,"zwei" to 2, "drei" to 3)
    map["vier"] = 4
    println(map.keys)
    for ( (k,v) in map)
        println("'$k'-->'$v'")
    /*
    for (i in 1..9){
        for (j in 1..i){
            print("${j}*${i}=${j*i}\t ")
        }
        println()
    }
    println("==================================================================")
    for (i in 9 downTo 1){
        for (j in 1..i){
            print("${j}*${i}=${j*i}\t ")
        }
        println()
    }
    */
    println(fruits)
    test_1()
    val x = 1
    when(x){
        1 ->println("x is 1")
        2 ->println("y is 2")
    }

}