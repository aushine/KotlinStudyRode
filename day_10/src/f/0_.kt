package f

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
