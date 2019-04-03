fun copy (from:Array<Any>,to:Array<Any>){
    assert(from.size == to.size)
    for(i in from.indices)
        to[i] = from[i]

}
//增加泛型以保证类型安全
fun <Int> Demo0(a:Int){
    println("Hello Kotlin")
}
fun <T> Demo1(a:T){
    when (a){
        is String ->println("$a 是一个字符串")
        is Int ->println("$a 是一个整型")
        else ->println("$a 既不是一个字符串也不是一个整型")

    }
}
class tes0<out Any>{
    fun a(){
        println("HelloWorld")
    }

}
interface demo1<T>{
    operator fun get(index:Int):T
}
fun <Int:Comparable<Int>>sort(list:List<Int>){
//泛型约束只使用Int类型中继承了comparable接口的数据类
}
val <T> List<T>.penultimate:T
    get() = this[size - 1]
class A<T>(val a:T){
    constructor(a:T,parent:A<T>):this(a){}

}

fun main(args:Array<String>){
    val list = mutableListOf<String>("Marie Rose","Yea Sakura","")
    println(list.penultimate)
    Demo1("Sakura")
    //使用泛型作为类型的实参
    val ints:Array<Int> = arrayOf(1, 2, 3)
    val a = mutableMapOf<Int,String>(1 to "eins",2 to "zwei",3 to "drei")




}