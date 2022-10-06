package Ejercicio01
    open class Dado (var valor:Int){

        constructor():this(0)

        open fun tirar(){
            valor = ((Math.random() * 6) + 1).toInt()

        }

        fun unidades(){

            if (valor>0 && valor<=6){


                when (valor) {

                    1 -> print("uno")
                    2 -> print("dos")
                    3 -> print("tres")
                    4 -> print("cuatro")
                    5 -> print("cinco")
                    6 -> print("seis")


                }
            }
        }

        fun imprimir(){
            println("valor del dado $valor")
        }
    }
