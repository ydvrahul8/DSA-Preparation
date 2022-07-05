package exercise

/**
 * Give 2 Arrays, create a function that let's user know(true/false) whether these two arrays contain any common items.
 * for example:-
 * const array1 = ['a','b','c','x']
 * const array2 = ['z','y','i']
 * should return false.
 *
 * const array1 = ['a','b','c','x']
 * const array2 = ['z','y','x']
 * should return true.
 * */

fun main() {

    val array1 = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g')
    val array2 = arrayOf('x', 'e', 'h', 'w', 'q', 'n', 'o')

    println(containsCommonItems1(array1, array2))
}

/**
 * This solution will have O(n). because we are using nested loop
 * */

fun containsCommonItems(array1: Array<Char>, array2: Array<Char>): Boolean {
    for (data1 in array1) {
        println(data1)
        for (data2 in array2)
            if (data1 == data2)
                return true
    }
    return false
}

/**
 * This solution is more efficient than the above in compare to Time Complexity
 * Tn=O(a+b)
 * */

fun containsCommonItems1(array1: Array<Char>, array2: Array<Char>): Boolean {
    val set = HashSet<Char>()
    for (data in array1) //O(a)
        set.add(data)
    for (data in array2) //O(b)
        if (set.contains(data))
            return true

    return false
}