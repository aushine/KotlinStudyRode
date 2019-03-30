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

fun main(args:Array<String>){

    var m = MyClass()
    print(m.getName())
}