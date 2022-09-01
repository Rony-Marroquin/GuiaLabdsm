fun main (){

// 6. Crear un programa que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y
//“Escaleno”, pida una opción y calcule el perímetro del triángulo seleccionado. Formulas:



println("Bienvenido ingrese una opcion\n" +
            "1.Equilatero\n"
          + "2.Isosceles\n"
           +"3.Escaleno")

val opcion: Int= readLine()!!.toInt()


if (opcion== 1){
    println("Ingrese lado1 ")
    var lado1:Int= readLine()!!.toInt()
    var perimetro: Int= (3) * lado1;


    println("El perimetro es $perimetro")
} else if(opcion== 2){
    println("Ingrese lado1 ")
    var lado2:Int= readLine()!!.toInt()
    println("Ingrese la base ")
    var base:Int= readLine()!!.toInt()
    var perimetro2: Int= (2*lado2) + base

    println("el perimetro es $perimetro2")

}else if (opcion==3){
    println("Ingrese lado1 ")
    var ladoUno:Int= readLine()!!.toInt()
    println("Ingrese lado2 ")
    var ladoDos:Int= readLine()!!.toInt()
    var perimetro: Int=  ladoUno + ladoDos
    var perimetro1 = Math.pow(ladoUno.toDouble(),2.0) +Math.pow(ladoDos.toDouble(),2.0)
    var perimetro2= Math.sqrt(perimetro1.toDouble())
    var perimetro3 = perimetro + perimetro2
    println("El perimetro es ${perimetro3.toInt()}")
}
}