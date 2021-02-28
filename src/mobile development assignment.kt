fun main(){
    name()
    modulus()
    var add=addition(1,2,3,4)
    println(add)
    interestingFacts()
}

fun name(){
    var name="hello Aluel"
    println(name)
}
fun modulus(){
    var a= 5
    var b=2
    var modulus=a%b
    println(modulus)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int {


    var add = num1 + num2 + num3 + num4
    return add
}
fun interestingFacts(){
    var interestingFacts=("I love dancing")
    println(interestingFacts)

}