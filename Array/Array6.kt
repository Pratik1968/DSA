package Array
// Find Second Max number
fun main(){
val a = intArrayOf(1,2,3,4,5,6,7)
    ArrayUtil6().secondMax(a)
}
class ArrayUtil6:ArrayUtil(){
    fun secondMax(value:IntArray){
        var firstMax = value[0]
        var secondMax =firstMax
        for(item in value){
            if(item>firstMax){
                secondMax = firstMax
                firstMax = item
            }
        }
println(secondMax)
    }
}