package com.example.campsitecommander

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val Button = findViewById<button>(R.id.add.xml)
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
            }

        }
    }
}