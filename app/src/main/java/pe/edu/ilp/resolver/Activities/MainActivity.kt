package pe.edu.ilp.resolver.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import pe.edu.ilp.resolver.Model.pregunta
import pe.edu.ilp.resolver.R

class MainActivity : AppCompatActivity() {
    var pregunta=ArrayList<pregunta>()
    var posicionactual=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pregunta1()
      pregunta2()
        pregunta3()
       cargarpreguntas()
        mostrarpreguntas()


        val btnverdadero=findViewById<android.view.View>(R.id.btnverdadero)
        btnverdadero.setOnClickListener {
            if (pregunta[posicionactual].respuesta)
                Toast.makeText( this,"la respuesta es correcta", Toast.LENGTH_SHORT).show()
            else
            Toast.makeText( this ,"la respuesta es incorrecta", Toast.LENGTH_SHORT).show()
        }
        val btnfalso=findViewById<android.view.View>(R.id.btnfalso)
        btnfalso.setOnClickListener {
            if (pregunta[posicionactual].respuesta)
            Toast.makeText( this,"la respuesta es correcta", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText( this ,"la respuesta es incorrecta", Toast.LENGTH_SHORT).show()
        }
        val btnsiguiente = findViewById<android.view.View>(R.id.btnsiguiente)
        posicionactual ++
        mostrarpreguntas()
    }

    private fun pregunta3() {
        var base =5
        var altura=3
        var area= (base * altura)/2
        println("el area del triangulo es $area")
    }

    private fun pregunta2() {
        val num = 5
        var factorial :Long=1
        for (i in 1..num) {
            factorial *= i.toLong() ;
        }
        println("Factorial de $num = $factorial")

    }

    private fun pregunta1() {
        for (i in 50 downTo 1 step 2 ){
            println("valor impreso inversa:$i" )
        }
    }



    private fun cargarpreguntas() {
        pregunta.add(pregunta("caracas es la capital de venexuela",true))
        pregunta.add(pregunta("piura es un departamento que pertene a ecuador",false))
        pregunta.add(pregunta("paraguay es la capita de chile",false))
        pregunta.add(pregunta("paraguay es la capita de chile",true))




    }
    private fun mostrarpreguntas() {
        val textopregunta = findViewById<TextView>(R.id.txtpregunta)
        textopregunta.text=pregunta[posicionactual].enunciado

    }
}