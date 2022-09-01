fun main () {
// 4.Crear un programa que pida tres números e indicar si el tercero es igual a la suma del primero y el segundo.

    println("Ingrese el primer numero")
    var num1: Int = readLine()!!.toInt()
    println("Ingrese el segundo numero")
    var num2: Int = readLine()!!.toInt()
    println("Ingrese el tercer numero")
    var num3: Int = readLine()!!.toInt()

    if (num1 + num2 == num3) {
        println("el numero3 es iguala  a la suma de numero1  $num1 y numero2 $num2")

    } else {
        println("la suma del numero1 y numero2 no son el numero3")

    }
}