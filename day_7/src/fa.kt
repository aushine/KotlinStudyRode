open class A(){
    open fun say(){
        println("Hello")
    }
}
class B() : A(){
    override fun say(){
        println("Hello guys")
    }
}
fun A.Hello(){
    println("HelloWorld")
}
fun B.Hello(){
    println("HelloWorld")
}
fun main(){
    var b = B()
    var a = A()
    a.Hello()
    b.Hello()
}