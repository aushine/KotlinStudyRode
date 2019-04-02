sealed class Expr
data class Contst(val number:Double):Expr()
data class Sum(val e1:Expr,val e2:Expr):Expr()
object NotANumber:Expr()
fun eval(expr:Expr):Double = when(expr){
    is Contst -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}
class Box0<T>(t:T){
/*
泛型就是类型的占位符
等到使用时再根据类型进行不同操作
*/

}
class Box<T>(t:T){
    var value = t
}

fun <T> boxIn(value:T) = Box(value)
fun <T> doprintln(content:T){
    when (content){
        is Int -> println("舰长,我可是${content}岁了哦")
        is String -> println("舰长副本零掉落,舰长补给全保底")
        else -> println("想不到再醒来,是五百年后了")
    }
}
fun <T: Comparable<T>> sort(list:List<T>){
//函数名叫做sort,接收一个可类比的泛型list
}
abstract class Source<out T>{
    abstract fun nextT():T
}

abstract class Comparable<in T>{
    abstract fun compareTo(other:T):Int
}
fun demo(x:Comparable<Number>){

    x.compareTo(1.0)
    val y:Comparable<Double> = x
}
abstract class Source1<out T>{
    abstract fun nextT():T
}
fun Demo0(strs:Source1<String>){
    val objects:Source1<Any> = strs
}

fun main(args:Array<String>){
    val list = listOf("aa","dddd","bbb","c")
    val sorted = list.sortedWith(compareBy{it.length})
    println(sorted)
    val age = 500
    val name = "Yea sakura"
    doprintln(age)
    doprintln(name)
    val asc = Array(5, {i -> (i * i).toString()})
    val boxInt = Box(10)
    var boxString = Box<String>("Yea Sakura")
    println(boxInt.value)
    println(boxString.value)
    val box4 = boxIn<Int>(1)
    val box5 = boxIn("Marie Rose")
    val a = Contst(1.3)
    val b = Contst(1.4)
    val c = Sum(a,b)
    //println(eval(c))
    //println(eval(NotANumber))
}