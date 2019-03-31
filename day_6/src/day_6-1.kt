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
enum class Direction{
    North,South,West,East
}
fun MutableList<Int>.swap(index1:Int,index2:Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}
open class C
class D:C()
fun C.foo() = "c"
fun D.foo() = "d"
fun printFoo(c:C){
    println(c.foo())
}

fun main(args:Array<String>){
    printFoo(D())
    var a = mutableListOf<Int>(1,2,3,4)
    a.swap(0,3)
    println(a)
println("Test")
}