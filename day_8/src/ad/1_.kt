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
fun main(){
    val box1:Box<Int> = Box(20)
    val list = mutableListOf<Any>()
    list.add("abc")
    list.add(99)

}