package Array

// Resizeable Array
fun main(){
ArrayUtil8().printArray(ArrayUtil8().resizeArray(intArrayOf(1,2,3,4,5),10))
}
class ArrayUtil8:ArrayUtil(){
fun resizeArray(value:IntArray,capacity:Int):IntArray{
    val temp = IntArray(capacity){0}
    for (i in 0..value.size-1){
        temp[i] = value[i]
    }
    return temp
}
}
