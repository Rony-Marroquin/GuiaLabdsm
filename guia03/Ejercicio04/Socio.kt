package Ejercicio04

open class Socio(var Nombre:String="",var Antiguedad:Int=0) {

    fun carga (){
        println("ingrese su nombre")
        Nombre= readLine()!!.toString()
        println("ingrese su años en el club")
        Antiguedad= readLine()!!.toInt()

    }



}