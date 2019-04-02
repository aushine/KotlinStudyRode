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

}
class Box<Int>(t:Int){
    var value = t
}
fun main(args:Array<String>){
    val asc = Array(5, { i -> (i * i).toString() })

    val a = Contst(1.3)
    val b = Contst(1.4)
    val c = Sum(a,b)
    //println(eval(c))
    //println(eval(NotANumber))



}