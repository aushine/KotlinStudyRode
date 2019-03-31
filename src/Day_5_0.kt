public var a11 = 1
private var a12 = 14
internal var a13 = 2
interface MyInterface{
    var a:Int
    fun process()
    fun getName():String{
        println("接口被调用")
        return "Bill"}
}
class MyClass:MyInterface{
    override var a = 1
    override fun process(){println("process")}
    override fun getName():String{
        return "Sakura"
    }
}
interface A0{
    fun foo(){print("A")}
    fun bar()
}
interface B0{
    fun foo(){print("B")}
    fun bar(){print("bar")}
}
class C0:A0{
    override  fun bar(){print("bar")}
}
internal class D0:A0,B0{
    override  fun foo(){
        super<A0>.foo()
        super<B0>.foo()
    }
    override fun bar(){
        super<B0>.bar()
    }
}

open class Outer{
    private  val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4
    inner class Nested{
        protected val e:Int = 5
    }
}
class Subclass:Outer(){
    var demo = Nested()
}
enum class Direction{
    NORTH,SOUTH,WEST,EAST
}
fun main(args:Array<String>){
        println(a12)
        var m = MyClass()
        print(m.getName())
    }