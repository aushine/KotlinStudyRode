/*
interface A{
    fun foo(){println("A")}
    fun bar()
}
interface B{
    fun foo(){println("B")}
    fun bar(){println("brarB")}
}
class C:A{
    override fun bar(){print("bar")}
}
class D: A,B {
    override fun foo(){
        super<A>.foo()
        super<B>.foo()
    }
    override fun bar(){
        super<B>.bar()
    }

}
*/
enum class Direction() {
    North, South, West, East

}
fun MutableList<Int>.swap(index1:Int,index2:Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}
open class C{

    fun foo(){println("member")}
}
class D:C()
fun C.foo(i:Int) = "go back fuck yourself"
fun D.foo() = "d"
fun printFoo(c:C){
    println(c.foo(1))
}
fun Any?.toString():String{//类的扩展
    if (this == null) return "null"
    return toString()
}
val <T> List<T>.lastIndex: Int//属性的扩展
    get() = size - 1
data class User(val name:String,val age:Int)

fun main(args:Array<String>){
    var x:ArrayList<Int> = ArrayList()
    var direction1:Direction
    var direction2:Direction = Direction.North
    var direction3:Direction = Direction.East
    var direction4:Direction = Direction.East
    println(Direction.East)
    println(direction2)
    if(direction3 == direction4){
        println("枚举类型值相等")
    }
    else{
         println("枚举类型值不相等")
    }
    var a1 = null
    println(a1.toString())
    C().foo()
    printFoo(C())
    var a = mutableListOf<Int>(1,2,3,4)
    var c = a.lastIndex
    println("c is ${c}")
    var b = mutableListOf<String>()
    a.swap(0,3)
    println(a)

}