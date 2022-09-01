fun main (){

    /*8.Se requiere calcular la edad de un individuo; para ello se va a tener como entrada dos fechas en el
            formato día (1 a 31), mes (1 a 12) y un año (entero de cuatro dígitos), correspondientes a la fecha
    de nacimiento y la fecha actual, respectivamente. Escriba un programa que calcule y muestre la edad del individuo.
    Si es la fecha de un bebé (menos de un año de edad), la edad se debe dar en meses y días; en caso
            contrario, la edad se calculará en años.

     */


  println("Ingrese el dia actual")
      var diaA = readLine()!!.toInt()
     println("ingresa el mes actual")
      var mesA= readLine()!!.toInt()
     println("ingres el año actual")
      var anoA= readLine()!!.toInt()
println("Ingrese el dia tu nacimiento")
var diaN = readLine()!!.toInt()
println("ingresa el mes de tu nacimiento")
var mesN= readLine()!!.toInt()
println("ingres el año nacimiento")
var anoN= readLine()!!.toInt()

var edad = anoA - anoN

if (mesN > mesA){
    edad = (edad - 1);
}
else if(mesN == mesA)
{
    if (diaN > diaA){
        edad= (edad - 1);
    }
}
else if (diaN== diaA) {

}
println("Tu edad es $edad")
}

