fun fibonacciSequence(n: Int){
    var a: Long = 0
    var b: Long = 1    
    if (n > 0){
        print(b)
    }
    
    var position = 2
    while (position <= n){
        val tmp = a + b
        print(" $tmp")
        a = b
        b = tmp
        position++
    }
}


fun main(args: Array<String>) {
    val n = 50
    println("Fibonacci sequence for $n:")
    fibonacciSequence(n)
}