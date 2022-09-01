fun main (){
//  5. Crear un programa que tome dos números y diga si ambos son pares o impares.

    println("Ingrese el primer numero")
    var num1: Int = readLine()!!.toInt()
    println("Ingrese el segundo numero")
    var num2: Int = readLine()!!.toInt()

    if (num1 % 2==0 && num2 % 2==0){
        print("los do numero son multiplos de 2")
    }else{
        println("No son multiplo de 2")
    }
}