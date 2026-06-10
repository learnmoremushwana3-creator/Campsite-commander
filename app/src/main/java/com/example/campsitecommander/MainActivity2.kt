package com.example.campsitecommander

import android.content.ClipData
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Comment
import java.util.Locale

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val Button = findViewById<button>(R.id.add_xml)
            button.setonClickListener(new View.OnclickListener()){
               @ovverride
               public void OnClickview(View v){
                   intent = new intent(mainActivity.this, mainActivity2.class);
                   startActivity(intent);

               }

                val button = findViewById<button>(R.id.add_xml)
                button.setOnClicklistener{
                    val intent = intent(this, MainActivity2::class.java)
                    startActivity(intent)
                }

                val arrayList = arrayListOf<ClipData.Item>(
                    "Tent"
                    "Marshmellows"
                    "Flashlight"
                )

                val arrayList = arrayListOf<Locale.Category>(
                    "Shelter"
                    "Food"
                    "Safety"
                )

                val arrayList = arrayListOf<Quantity>(
                    "Shelter = 2"
                    "Food = 4"
                    "Safety = 2"
                )

                val arrayList = arrayListOf<Comment>(
                    "4 person waterproofing"
                    "Texas corn succotash"
                    "Check batteries "
                )

            }
            val inputNumber = findViewById<Edittext>(R.id.etNumbers)
            val btncalculators = findViewById<button>(R.id.add_xml)

            var sum = 0
            for (num in numbers){
                sum += num
            }

        }
    }
}