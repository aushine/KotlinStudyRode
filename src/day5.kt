class A5() {
    /*
    var name:String = "shine"
    var flag:Boolean = true
    fun description(){
        //println("name:${name} value:${value} flag:${flag}")
    }
    val name5:String
        get() = "six"
    var v:Int = 20
    var value5:Int = 11
        get() = field
    set (value){
        if(value < 10){
            field = value
        }else{
            field = -1
        }

        }
    var no : Int = 11
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }
    var counter = -3
        get() = field
    set(value){
        if (value >= 0)
            field = value
    }
    var value:Int = 10
    get() = field
    set(value){
        println("value属性被设置")
        field = value
    }
    var no2 : Int = 20
        get() = field
        set(value) {
            if (value < 10) {
                println("属性被复写")
                field = value
            } else {
                println("属性被复写")
                field = -1
            }

        }
    var no10 :Int = 109
        get() = field
        set(value){
            if(value < 10){
                field = value
            }else{
                field = -1
            }
        }
    */

}
interface interface_Test {
    fun bar(){}
    fun func1(){}

}
class Child:interface_Test{
    override  fun bar(){println("I am so cool")}
}
interface Interface_Test0{
    val prop:Int
    val propertyWithImplementation:String
        get() = "foo"
    fun foo(){
        println(prop)
    }
}
class Child1:Interface_Test0{
    override val prop:Int = 29

}


fun main(args:Array<String>){
    var c = Child1()
    println(c.prop)

}