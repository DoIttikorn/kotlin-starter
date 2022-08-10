fun main(args: Array<String>) {
    println("Enter Two number")
//    val (a,b) = readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
//    println("sum of $a and $b is ${sum(a.toInt(),b.toInt())}")
//--
    variables()
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
//--
    loop()
//--
    println(whenExpression("asdasd"))
//    --
    rangeLoop()
// type checks and automatic
    val stringLength = getStringLength("ittikorn Chawkamud")
    println(stringLength)
    val stringLength2 = getStringLength2("ittikorn Chawkamud")
    println(stringLength2)
//    ---
//    data class
    val user1 = User("Akexorcist", 19, true)
    println(user1.toString())
    println(user1.hashCode())

    val user2 = User("Akexorcist", 19, true)
    println(user2.toString())
    println(user2.hashCode())
//  ---
//    copy
    val user = User("Akexorcist", 19, true)
    val newUser = user.copy(name = "Black Lens")
// user = User(name="Akexorcist", age=19, isAwesomeUser=true)
// newUser = User(name="Black Lens", age=19, isAwesomeUser=true)
    println("$user : $newUser")
//    ---
//    Destructuring Declarations
    val (name1, age1, isAwesomeUser1) = user
    println("name: $name1 , age: $age1 , isAwesomeUser : $isAwesomeUser1")
//    ComponentN
    val name = user.component1()
    val age = user.component2()
    val isAwesomeUser = user.component3()
    println("get property by component -> $name , $age , $isAwesomeUser ")
// name = "Akexorcist", age = 19, isAwesomeUser = true
}

//short functions
fun sum(a: Int, b: Int) = a + b

fun maxNum(a: Int, b: Int): Int {
    val max = if (a > b) {
        println("The value of a is $a")
        a
    } else {
        println("The value of b is $b")
        b
    }
    return max
}

fun variables() {
    val a: Int = 1 // immediate assignment
    val b = 2 // `Int` type is inferred
    val c: Int // Type required when no initializer si provided
    c = 3 // deferred assignment

//    top level
    val PI = 3.14
    var x = 0
    fun increment() {
        x += 1
    }
    println("x = $x ,PI = $PI ")
    increment()
    println("increment()")
    println("x = $x ,PI = $PI ")

}

fun loop() {
    val items = listOf("apple", "banana", "kiwit")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whileLoop() {
    val items = listOf<String>("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun rangeLoop() {
    val list = listOf<String>("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    for (x in 1..5) {
        print(x)
    }
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

}

// type checks and automatic casts
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}

fun whenExpression(obj: Any): String =
    when (obj) {
        1 -> "One"
        "hello" -> "greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

open class Shap

class Rectangle(var height: Double, var length: Double) : Shap() {
    var perimeter = (height + length) * 2
}

//  data class จะจัดการ data ให้เราในการสร้าง modal
data class User(var name: String, var age: Int, var isAwesomeUser: Boolean)