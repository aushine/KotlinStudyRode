package ad

import java.lang.management.MemoryUsage

open class SuperBasic{

}
open class Basic:SuperBasic(){

}
class Son:Basic(){

}
fun testTemp(list:MutableList<out Basic>){
}
fun testTemp2(list:MutableList<in Basic>){
}

fun main(args:Array<String>){
    testTemp(mutableListOf<Son>())
    testTemp2(mutableListOf<SuperBasic>())
}