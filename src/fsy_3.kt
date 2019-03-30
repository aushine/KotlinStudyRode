open class QACommuntity(var url:String) {
    init { println(url) }
    constructor(url: String,parent:QACommuntity):this(url){

    }
    constructor(value: Int) : this("www.baidu.com") {
        println("被调用")
        println(value)
    }
    constructor(description: String,url:String) : this(url) {
        println(description + ":" + url)
    }
    constructor() : this(20) {
        println("<htttp://bilibili.com>")
    }
}
interface Foo{
    val count:Int
}
open class Base(p:Int){

    open fun v(){
        println("In the Base")
    }
}
class Derived(p:Int):Base(p){
    init {
        println("被调用")
    }
    override fun v(){
        println("so crazy")
    }
}
open class A{
    open fun t(){}
    open fun f(){println("A")}
    open fun a(){println("a")}
}
abstract class Test0_:A(){
    override abstract fun t()
}
interface B{
    //override abstract fun a()
    fun f(){println("B")}
    fun b(){println("b")}
}
class C():A(),B{
    override fun f(){
        super<A>.f()
        super<B>.f()
        a()
        b()
    }
}


fun main(){
    var y = 0
    var j = 1
    var x = 0
    loop@ while(true) {
        x = j * 4
        for(i in 1..5){
            y = i
            if (x % 4 !=0){
                break
            }else{
                x = (x/4) * 5 + 1
            }
            if (i == 5) break@loop
        }
        j += 1
    }
    println(x)
    var a = QACommuntity("www.bilibili.com")
    a = QACommuntity(100)
    a = QACommuntity("同性交友社区","www.github.com")
    a = QACommuntity()
    fun test(a:String ="test0"):String{
        return a.toUpperCase()
    }


}