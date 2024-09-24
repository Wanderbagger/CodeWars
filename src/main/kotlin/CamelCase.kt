fun toCamelCase(str:String):String {
    var isFirst = true
    var result = ""
    for(word in str.split('_', '-')) {
        if (isFirst) {
            isFirst = false
            result += word
        } else {
            result += word.capitalize()
        }
    }
return result
}
fun main() {
    println( toCamelCase("the_stealth-warrior"))
}