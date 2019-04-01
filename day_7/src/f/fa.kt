package f
open class Parent(val value1:Int,val value2:Int){
    var mValue1:Int = value1
    var mValue2:Int = value2
    fun add():Int{
        return mValue1 + mValue2
    }
}
class Child(value1:Int,value2:Int):Parent(value1,value2){
    fun sub():Int{
        return mValue1 - mValue2
    }
}
fun Parent.printRestult(){
    println("${mValue1} + ${mValue2} = ${add()}")
}
fun Child.printRestult(){
    println("${mValue1} - ${mValue2} = ${sub()}")
}
fun main(args:Array<String>){
    var a = Parent(1,2)
    var b = Child(1,2)
    a.printRestult()
    b.printRestult()
}