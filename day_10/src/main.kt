import f.*

fun main(args:Array<String>) {
    val c3 = Myclass3()
    val c4 = Mycalss4()
    c3.name = "Sakura"
    c4.name = "Marie"

    val j8:String = "dick"
    var c1 = MyClass1()
    var c2 = MyClass2()
    c1.name = "Yea Sakura"
    c2.name = ""
    val b = BaseImpl(10)
    Derived(b).print()

    val x = MyClass.x

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