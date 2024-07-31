package Array

// Find Minimum value in array
fun main(){
val a= intArrayOf(-1,2,3,4,5,6)
    ArrayUtil5().min(a)
}
class ArrayUtil5:ArrayUtil(){
    fun min(value:IntArray){
        var minValue = value[0]
        for(item in value){
            if(item<minValue) minValue = item
        }
        println(minValue)
    }
}