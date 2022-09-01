fun main (){
    //3. Cree un programa que pida 2 números al usuario y determine si el primer número es múltiplo del segundo.


println("Ingrese el primer numero")
var num1: Int = readLine()!!.toInt()
println("Ingrese el segundo numero")
var num2: Int = readLine()!!.toInt()

if(num1%num2==0)
    println("El primer numero es multiplo del segundo")
else{
    println("El primer no es multiplo del segundo")
}
}