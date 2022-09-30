package Ejercici01

class alumno1(private var nombre:String,private var nota:Int) {

     constructor():this("",0)

    fun EntradaDato (){
        println("Ingrese su nombre")
        nombre= readLine()!!.toString()
        println("Ingrese su nota")
        nota= readLine()!!.toInt()
    }
    fun validacion (){
        if (nota>=6){
            println("$nombre ustede a aprobado con una nota de $nota")
        }else{
            println("$nombre usted a reprobado con una nota de $nota")
        }
    }

}