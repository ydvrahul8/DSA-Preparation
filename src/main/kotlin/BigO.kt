fun main() {
    val startTime = System.currentTimeMillis()
    val list = List<String>(10000) { "Find Nemo" }
    for (data in list) {
        println(data)
    }
    val endTime = System.currentTimeMillis()
    println("Total Time is ${endTime - startTime}")
}