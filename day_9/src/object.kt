
class Outer{
    private val bar:Int = 1
    inner class Inner{
        fun foo() = bar
    }
}
enum class Color(val rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
enum class RGB{RED, GREEN, BLUE}
inline fun<reified RGB:Enum<RGB>>printAllValues(){
    println(enumValues<RGB>().joinToString{it.name})
}
open class Order<T>(val orderName:String, val orderId:Int, val t:T, val list:MutableList<T> = ArrayList())
{
    fun add(){
        list.add(t)
    }
    fun getString():String{
        return orderName
    }
   fun <Order>uuiuT():T{
       return t

   }
}
open class MyClass(name:String){
    open var name = name
    open fun verify(){
        println("verify")
    }

}
interface MyInterface{
    fun closeData(){
        println("天行健,君子以自强不息")
    }
}
fun process(obj:MyClass){
    obj.verify()
    if (obj is MyInterface){
        obj.closeData()
    }
}
object a:MyClass("Sakura"),MyInterface
{   override fun verify(){
        println("Marie Rose")
    }
}
fun foo()
{
    val adHoc = object{
        var x:Int = 0
        var y:Int = 0
    }
    println(adHoc.x + adHoc.y)
}
class HerClass{
    //private函数,返回值类型是匿名对象本身,可以访问x
    private fun foo() = object {
        val x:String = "x"
    }
    //public函数,由于匿名对象没有任何父类型,因此函数的返回类是Any
    fun publicFoo() = object
    {
        val x :String = "y"
    }
    fun bar()
    {
        val x1 = foo().x
        //val x2 = publicFoo().x
    }

}

fun main(args:Array<String>){
    foo()

    process(a)

    val order = Order("sakura",500,true)
    val list:MutableList<String> =ArrayList()
    val list1 = mutableListOf<String>()
    val list3 = listOf("")
    list.add("nmsl")

    printAllValues<RGB>()
    var name:String
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.joinToString("-"))
    println(numbers.joinToString(prefix = "{",postfix = "}"))
    println(numbers.joinToString(prefix = "<",postfix=">",separator = "?"))
    var chars = charArrayOf('a','b','c','d','e','f','g','h')
    println(chars.joinToString(limit = 5,truncated = "...!"){it.toUpperCase().toString()})
    println(chars.map{it.toUpperCase()})
    val a:Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(a.joinToString{"1"})
    for(i in a){
        println(i)
    }
    val demo = Outer().Inner().foo()
    println(demo)
    process(object:MyClass("Sakura"){
        override fun verify(){
            println("object verify")
        }
    })
}