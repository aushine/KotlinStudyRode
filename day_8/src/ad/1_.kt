package ad

abstract class Source<out T>{
    abstract fun nextT():T
}

fun demo(strs:Source<String>){
    val objects:Source<Any> = strs
}
class Box<T>(t:T){
    var value = t
}
class Tes1<in T>{
    constructor(a:T){
        when(a){
            is String -> println("a is a String")
            is Int -> println("a is a Int")
            else -> println("a not is a String or Int")

        }
    }
}
fun main(){
    Tes1(1)
    var list1 = mutableListOf<String>()
    var list2:Any = list1

    val box1:Box<Int> = Box(20)
    val list = mutableListOf<Any>()
    list.add("abc")
    list.add(99)

}