package Ejercicio02

class punto (private var x:Int,private var y: Int) {

    constructor():this(0,0)

    fun EntradaDato(){

        println("Ingrese la cordena en (x)")
        x= readLine()!!.toInt()
        println("Ingrese la cordenada en (y)")
        y= readLine()!!.toInt()
    }
    fun cuadrante () {
        when {
            x > 0 && y > 0 -> println("Primer cuadrante")
            x < 0 && y > 0 -> println("Segundo cuadrante")
            x < 0 && y < 0 -> println("Tercer cuadrante")
            x > 0 && y < 0 -> println("Cuarto cuadrante")
            x == 0 -> println("el punto se encuntra en eje (x)")
            y == 0 -> println("el punto se encuntra en eje (y)")

        }

    }

}