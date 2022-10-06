 package udb.eu.operacionesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import android.widget.TextView
 import  android.widget.Button
 import  android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val txvnum1 =findViewById<EditText>(R.id.txvnum1)
        val txvnum2 =findViewById<EditText>(R.id.txvnum2)
        val txvresultado =findViewById<TextView>(R.id.txvresultado)

        val btnsuma=findViewById<Button>(R.id.btnsuma)
        val btnresta=findViewById<Button>(R.id.btnresta)
        val btnmultiplicacion=findViewById<Button>(R.id.btnmultiplicacion)
        val btndivicion=findViewById<Button>(R.id.btndivicion)

        btnsuma.setOnClickListener{
            val txvnum1 =findViewById<EditText>(R.id.txvnum1)
            val nro1 = txvnum1.text.toString().toInt()
            val nro2 = txvnum2.text.toString().toInt()
            val suma =nro1 + nro2
          txvresultado.text ="Resultado: ${suma.toString()}"


        }






        btnresta.setOnClickListener{
            val txvnum1 =findViewById<EditText>(R.id.txvnum1)
            val nro1 = txvnum1.text.toString().toInt()
            val nro2 = txvnum2.text.toString().toInt()
            val resta =nro1 - nro2
            txvresultado.text ="Resultado: ${resta.toString()}"
        }

        btnmultiplicacion.setOnClickListener{
            val txvnum1 =findViewById<EditText>(R.id.txvnum1)
            val nro1 = txvnum1.text.toString().toInt()
            val nro2 = txvnum2.text.toString().toInt()
            val multiplicacion =nro1 * nro2
            txvresultado.text ="Resultado: ${multiplicacion.toString()}"
        }

        btndivicion.setOnClickListener{
            val txvnum1 =findViewById<EditText>(R.id.txvnum1)
            val txvnum2 =findViewById<EditText>(R.id.txvnum2)

            val nro1 = txvnum1.text.toString().toInt()
            val nro2 = txvnum2.text.toString().toInt()
            val divicion =(nro1) / (nro2)
            txvresultado.text ="Resultado: ${divicion.toString()}"
        }


    }
}