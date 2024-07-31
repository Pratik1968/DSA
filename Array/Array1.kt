package Array

// How to create Array and Initialize it 
    fun main() {
// 1. First Way
        val a = intArrayOf(1, 2, 3, 4, 4)
        println(a[0])

// 2. Second Way
        val array = IntArray(5)
        array[0] = 1
        array[2] = 2
        array[1] = 3
        println(array[1])
    }
