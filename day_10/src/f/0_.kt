package f

import kotlin.reflect.KProperty

class Delegate{
    //用于保存属性值的成员变量
    var name:String = ""
    operator  fun getValue(thisRef:Any?,property:KProperty<*>):String{
        //获取thisRef指定的类名
        val className = thisRef.toString().substringBefore("@")
        println("${className}.get已被调用")
        return name
    }
    operator fun setValue(thisRef: Any?,property:KProperty<*>,value:String)
    {
        val className = thisRef.toString().substringBefore('@')
        println("${className}.set已经被调用")
    }

    }
class Myclass3{
    //将name 属性委托给Delegate类
    var name:String by Delegate()
}
class Mycalss4{
    var name:String by Delegate()
}
class MyClass1{
    var name:String = ""
        get():String{
            println("Myclass1.get 已经被调用")
            return field
        }
    set(value:String){
        println("Myclass1.set 已经被调用")
        field = value
    }
}
class MyClass2{
    var name :String = ""
    get():String{
        println("MyClass.get已经被调用")
        return field
    }
    set (value:String){
        println("MyClass.set已经被调用")
        field = value
    }
}
interface Base{
    fun print()
}
open class BaseImpl(val x:Int):Base{
    override fun print(){println("$x X_man!")}
}
//将Base的对象c委托给了Derived,Derived可以直接使用对象c的print方法
class Derived(c:Base):Base by c
{
    fun getName():String{
        return "Sakura"
    }
}

open class MyClass
{

    companion object {
        val x = 1
    }
    open fun test(){
        println("Test")
    }
       private fun foo() = object{
        val x:String = "x"
    }
    fun publicFoo() = object{
        val x:String = "Y"
    }
    fun bar(){
        val x1 = foo().x

    }
}
fun process(obj:MyClass){
    obj.test()

}
