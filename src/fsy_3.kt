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
fun main(){
    QACommuntity("www.bilibili.com")
    QACommuntity(100)
    QACommuntity("大型同性交友网站","www.github.com")
    QACommuntity()



}