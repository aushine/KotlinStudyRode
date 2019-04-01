open class Parent(val value1:Int, val value2:Int) {
    var mValue1: Int = value1
    var mValue2: Int = value2
    fun add(): Int {
        return mValue1 + mValue2
    }
    open fun printResult(){
        println("${mValue1} + ${mValue2} = ${add()}")
    }
}
class Child(value1:Int,value2:Int):Parent(value1,value2) {
    fun sub(): Int {
        return mValue1 - mValue2

    }
    override fun printResult(){
        println("${mValue1} - ${mValue2} = ${sub()}")
    }
}
class Mycalss{
    private  var strValue:String = ""
    constructor(){println("x_man!")}
    private constructor(str: String)
    {
        strValue = str
    }
    override  fun toString():String{

        return strValue
    }
    fun newInstance(value:Int):Mycalss{
        return Mycalss("内部成员函数")
    }
}
fun Mycalss.newInstance(value:Int):Mycalss{
    return Mycalss()
}
fun Any?.toString():String{
    if (this == null){return "Null"}
    return this.toString()
}
/*
class Wife(val name:String,val age:Int)
{ //var name:String = name
    //var age:Int = age
    override fun toString ():String{
        return "Wings(name is ${name}, age is ${age})"
    }
    override fun equals(other:Any?):Boolean{
        if(other is Wife){
            if(name == other.name && age == other.age){
                return true
            }
        }
     return false
    }
}
#一般类的写法
*/
//使用数据类重写Wife方法
//功能同上述一般类写法一模一样
data class Wife(val name:String, val age:Int)
//定义为数据类
class As(){}
fun main(args:Array<String>){
    var wife1 = Wife("Sakura",500)
    var wife2 = Wife("Marie Rose",17)
    var wife3 = Wife("Sakura",500)
    println(wife1)
    println(wife2)
    println(wife1.equals(wife3))
    println(wife1.equals(wife2))
    /*
    #一般类
    var wife1 = Wife("Sakura",500)
    var wife2 = Wife("Marie Rose",17)
    var wife3 = Wife("Sakura",500)
    println(wife1)
    println(wife2)
    //上述两个输出语句输出wife的实例 wife1和wife2
    //并没有返回值的时候toString会默认输出对象的hash值
    //如果哈希值相同,则表示是同一个对象
    println(wife1.equals(wife3))
    println(wife1.equals(wife2))
*/
    val a = null
    println(a.toString())
    println(Mycalss().newInstance(20))

    val parent1:Parent = Parent(1,2)
    val parent2:Parent = Child(1,2)
    parent1.printResult()
    parent2.printResult()
}