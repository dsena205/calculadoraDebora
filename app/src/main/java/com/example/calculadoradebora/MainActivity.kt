package com.example.calculadoradebora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //definindo caixa de edição
        val n1 = findViewById<EditText>(R.id.edit1)
        val n2 = findViewById<EditText>(R.id.edit2)
        var resultado = findViewById<EditText>(R.id.editresultado)

        //definindo os botões
        val botaoSomar = findViewById<Button>(R.id.btnsomar)
        val botaosubtrair = findViewById<Button>(R.id.btnsubtrair)
        val botaomultiplicar = findViewById<Button>(R.id.btnmultiplicar)
        val botaodividir = findViewById<Button>(R.id.btndividir)


        botaoSomar.setOnClickListener {
            val numero1: Double
            val numero2: Double
            var resultadoo: Double

            numero1 = n1.text.toString().toDouble()
            numero2 = n2.text.toString().toDouble()
            resultadoo = (numero1 + numero2)

            resultado.setText(resultadoo.toString())
        }

        botaomultiplicar.setOnClickListener {
            val numero1: Double
            val numero2: Double
            var resultadoo: Double

            numero1 = n1.text.toString().toDouble()
            numero2 = n2.text.toString().toDouble()
            resultadoo = (numero1 * numero2)

            resultado.setText(resultadoo.toString())
        }

        botaosubtrair.setOnClickListener {
            val numero1: Double
            val numero2: Double
            var resultadoo: Double

            numero1 = n1.text.toString().toDouble()
            numero2 = n2.text.toString().toDouble()
            resultadoo = (numero1 - numero2)

            resultado.setText(resultadoo.toString())
        }
        botaodividir.setOnClickListener {
            val numero1: Double
            val numero2: Double
            var resultadoo: Double

            numero1 = n1.text.toString().toDouble()
            numero2 = n2.text.toString().toDouble()
            resultadoo = (numero1 / numero2)

            resultadoo = 0.0
            if (numero1 == 0.0 || numero2 == 0.0) {
                var alert = "não é possivel dividir por zero"
                Toast.makeText(this, alert, Toast.LENGTH_LONG).show()
                resultado.setText(resultadoo.toString())
            }
        }
    }
}