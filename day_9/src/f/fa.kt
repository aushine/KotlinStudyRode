package f

import kotlin.math.abs

abstract class Souce<out T>{
    abstract fun nextT():T
}
fun demo(strs:Souce<String>){
    val objects:Souce<Any>  = strs
}
//out 只要父类是Any的泛型就能通过验证
fun copy(from:Array<out Any>,to:Array<Any>){
    assert(from.size == to.size)
    for(i in from.indices)
        to[i] = from[i]
}
fun main(args:Array<String>){
    val ints:Array<Int> = arrayOf(1, 2, 3)
    val any:Array<Any> = Array(4,{i -> i})
    copy(ints,any)
}