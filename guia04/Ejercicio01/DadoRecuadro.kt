package Ejercicio01

import Ejercicio01.Dado

class DadoRecuadro(valor:Int): Dado(valor){
    constructor():this(0)

    override fun tirar () {
        var asterisco = 0

        valor = ((Math.random() * 6) + 1).toInt()
        for (i in 1..valor) {
            println("*")

        }
    }
}