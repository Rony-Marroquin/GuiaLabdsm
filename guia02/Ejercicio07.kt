fun main (){
    //7.  Desarrollar un programa en kotlin que acepte las fechas escritas de modo usual y las visualice como números.

    var dia  = 0
    var mes = ""
    var year = 0

 println(" ingrese el dia")
dia = readLine()!!.toInt()
println("ingrese el mes")
mes= readLine()!!.toString()
when(mes){
     "enero"-> println("01")
     "febrero"-> println("02")
    "marzo"-> println("03")
    "abril"-> println("04")
    "mayo"-> println("05")
    "junio"-> println("06")
    "julio"-> println("07")
    "agosto"-> println("08")
    "septiembre"-> println("09")
    "octubre"-> println("10")
    "noviembre"-> println("11")
    "Diciembre"-> println("12")
    else -> print("mes no encontrado")

}

println("Ingrese el año")
year= readLine()!!.toInt()

println("La fecha es $dia - $mes - $year")
}