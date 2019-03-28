open class QACommuntity(var url:String) {
    init {
        println(url)
    }
    constructor(url: String,parent:QACommuntity):this(url){

    }
    constructor(value: Int) : this("www.baidu.com") {
        println("被调用")
        println(value)
    }

    constructor(description: String, url: String) : this("[" + url + "]") {
        println(description + ":" + url)
    }

    constructor() : this(20) {
        println("<htttp://bilibili.com>")
    }
}
open class Base{
    open fun v(){
        println("In the Base")
    }
}
class Derived():Base(){
    init {
        println("被调用")
    }
    override fun v(){
        println("so crazy")
    }
}
fun main(){
    var y = 0
    var j = 1
    var x = 0
    loop@ while(true) {
        x = j * 4
        for(i in 1..5){
            y = i
            if (x % 4 !=0){
                break
            }else{
                x = (x/4) * 5 + 1
            }
            if (i == 5) break@loop
        }
        j += 1
    }
    println(x)
    QACommuntity("www.bilibili.com")
    QACommuntity(100)
    QACommuntity("大型同性交友网站","www.github.com")
    QACommuntity()
    var a = Derived()


}