/**
 * Created by xquan on 3/27/2017.
 */

enum class Lang(val hello: String) {
    ENGLISH("Hello"),
    CHINESE("你好"),
    JAPANESE("asdf"),
    KOREAN("asdf");

    fun sayHello() {
        println(hello)
    }

    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    if (args.size == 0)
        return
    val lang = Lang.parse(args[0])
    println(lang)
    lang.sayHello()
    lang.sayBye()
}

fun Lang.sayBye() {
    val bye = when(this) {
        Lang.ENGLISH -> "Bye"
        Lang.CHINESE -> "再见"
        Lang.JAPANESE -> "asdfsd"
        Lang.KOREAN -> "esdpe"
    }
    println(bye)
}
