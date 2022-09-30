package Ejercicio03


 class Hijos(private val Edades:IntArray= IntArray(5)) {

     constructor() : this(IntArray(5))


     fun cargaDatos(): IntArray {

         for (i in Edades.indices) {
             println("Porfavor ingrese su edad")
             Edades[i] = readLine()!!.toInt()


         }

         return Edades


     }

     fun EdadMayor() {

         if (Edades[0]>Edades[1]&& Edades[0]>Edades[2]&&Edades[0]>Edades[3]&& Edades[0]> Edades[4]){
             println("La edad mayor es ${Edades[0]}")
         }
         else if (Edades[2]>Edades[1]&& Edades[2]>Edades[0]&&Edades[2]>Edades[3]&& Edades[2]> Edades[4])
         {
             println("La edad mayor es ${Edades[2]}")
         }
         else if (Edades[1]>Edades[2]&& Edades[1]>Edades[3]&&Edades[1]>Edades[3]&& Edades[1]> Edades[4])
         {
             println("La edad mayor es ${Edades[1]}")
         }
         else if (Edades[3]>Edades[1]&& Edades[3]>Edades[2]&&Edades[3]>Edades[0]&& Edades[3]> Edades[4])
         {
             println("La edad mayor es ${Edades[3]}")
         }
         else if (Edades[4]>Edades[1]&& Edades[4]>Edades[2]&&Edades[4]>Edades[3]&& Edades[4]> Edades[0])
         {
             println("La edad mayor es ${Edades[4]}")
         }
     }

     fun promedio() {
         var prom = ((Edades[0] + Edades[1] + Edades[2] + Edades[3] + Edades[4]) / 5)
         println("El promedio es $prom")

     }



 }




