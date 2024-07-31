package Array

// Move Zeroes to the end of zeroes
fun main(){
val a = intArrayOf(1,2,3,0,0,5,0)
    ArrayUtil7().moveZeroesToEnd(a)
}
class ArrayUtil7:ArrayUtil(){
    fun moveZeroesToEnd(value:IntArray){
                val i = IntArray(value.size){0}
        var counter =0
        var lastIndex=0
        for(item in value){
            if(item!=0){
                i[lastIndex] = item
                lastIndex++

            }
            counter++
        }
        printArray(i)
    }
}