fun main () {

    // 1. Cree un programa que pida 3 números al usuario y determine cuál de ellos es el mayor.

    println("Ingrese el primer numero")
    var num1: Int = readLine()!!.toInt()
    println("Ingrese el segundo numero")
    var num2: Int = readLine()!!.toInt()
    println("Ingrese el tercer numero")
    var num3: Int = readLine()!!.toInt()

    if (num1>num2 && num1>num3){

        println("el numero mayor es $num1")

    } else if (num2>num1 && num2>num3){
        println("el numero mayor es $num2")
    }else{
        println("el numero mayor es $num3")

   }


}


