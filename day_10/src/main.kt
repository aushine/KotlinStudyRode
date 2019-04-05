import f.MyClass
import f.process

fun main(args:Array<String>) {
    val x = MyClass.Companion.x
    println(x)
    var n = 20
    process(object:MyClass() {
        override fun test(){
            if(n == 20){
                println("Success")
            }else{
                println(println("Failed"))
            }
        }
    })
    /*
    process(object:MyClass() {
        override fun test(){
            if(n == 20){
                println("Success")
            }else{
                println(println("Failed"))
            }
        }
    })
    */

    MyClass().bar()
}