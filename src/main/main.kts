import java.util.*


fun task2(list1: IntArray, list2:IntArray): IntArray {

    println(Arrays.toString(list1))
    println(Arrays.toString(list2))
    val intersec=list1.intersect(list2.toList()).toIntArray()
    println(Arrays.toString(intersec))

    return intersec

}

fun task3(list1: IntArray, list2:IntArray):IntArray{
    return list1.plus(list2)

}
/*fun task5(list: IntArray, size:Int){
    var first:Int
    var second:Int
    var size=list.size
    var i:Int


}*/


fun main(){
    val  arr1= intArrayOf(12,14,16,18)
    val   arr2= intArrayOf(11,14,16,20)
    val intersecc=task2(arr1,arr2)

    println((intersecc))



    val list1=intArrayOf(12,14,15,17)
    val list2=intArrayOf(13,56)
    val merge=task3(list1,list2)
    println(merge.contentToString())
}







