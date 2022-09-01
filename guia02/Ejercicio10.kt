fun main(){
    //10. Hacer un programa con un menú que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.

    println("Bienvenido elija una opcion\n" +
            "1. Kg a libra\n" +
            "2. Kg a onzas\n" +
            "3. Kg a toneladas")

    var opcion = readln()!!.toInt()

    if (opcion==1){

        println("Ingre datos en kilogramos")
        var kg = readln()!!.toDouble()
        val lb=2.20462
        val res= kg *lb
        println("El resultado en libra es $res")


    }
    else if(opcion==2){
        println("Ingre datos en kilogramos")
        var kg = readln()!!.toDouble()
        val onza = 35.274
        val res = kg * onza
        println("El resultado es $res")


    }else if (opcion==3){
        println("Ingre datos en kilogramos")
        var kg = readln()!!.toDouble()
        val tone = 0.001
        val res = kg * tone
        println("El resultado es $res")


    }


}