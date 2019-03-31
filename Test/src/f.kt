enum class Direction private constructor(val d:Int){
    North(1),South(2),West(3),East(4);
    override fun toString():String{
        println("go back fuck yourself")
        return d.toString()
    }
}
class A(){
    override fun toString():String{
        return "fuckoff"
    }
}
enum class Color(val rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main(args:Array<String>){
    var direction1: Direction = Direction.North
    var direction2 = Direction.West
    //println(direction1)
    println(direction2)
    var a = A()
    println(a)

}