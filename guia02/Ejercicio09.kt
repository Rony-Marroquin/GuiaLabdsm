fun main () {
    // 9. Hacer un programa que posea dentro de él 2 menús, teniendo el siguiente formato:

    println(
        "a) conversion de colones a dolares\n" +
                "b) coversion de millas akilometros\n" +
                "c) conversion de grados Celsius a grados Fahrenheit\n" +
                "d) segundo menu"
    )

    val opcion: String = readLine()!!.toString()

    if (opcion == "a") {

    } else if (opcion == "b") {

    } else if (opcion == "c") {

    } else if (opcion == "d") {
        println(
            "1. si es positivo o negativo\n" +
                    "2. área de un triangulo\n" +
                    "3. fin submenú"
        )

        val opcion1: Int = readLine()!!.toInt()
        if (opcion1 == 1) {
        } else if (opcion1 == 2) {

        } else if (opcion1 == 3) {

        }


    } else if (opcion == "e") {

    }
}