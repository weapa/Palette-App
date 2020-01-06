package th.ac.su.ict.piyada.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var colorButton = findViewById<TextView>(R.id.colorButton)
        var color1 = findViewById<Button>(R.id.color1)
        var color2 = findViewById<Button>(R.id.color2)
        var color3 = findViewById<Button>(R.id.color3)
        var color4 = findViewById<Button>(R.id.color4)
        var color5 = findViewById<Button>(R.id.color5)
        var color6 = findViewById<Button>(R.id.color6)

        color1.setOnClickListener {
            colorButton.setText("235-255-221")
            colorButton.setBackgroundColor(Color.parseColor("#EBE1DD"))
        }
        color2.setOnClickListener {
            colorButton.setText("236-203-202")
            colorButton.setBackgroundColor(Color.parseColor("#00574B"))
        }
        color3.setOnClickListener {
            colorButton.setText("117-131-156")
            colorButton.setBackgroundColor(Color.parseColor("#75839C"))
        }
        color4.setOnClickListener {
            colorButton.setText("153-169-191")
            colorButton.setBackgroundColor(Color.parseColor("#99A9BF"))
        }
        color5.setOnClickListener {
            colorButton.setText("195-204-216")
            colorButton.setBackgroundColor(Color.parseColor("#C3CCD5"))
        }
        color6.setOnClickListener {
            colorButton.setText("221-226-269")
            colorButton.setBackgroundColor(Color.parseColor("#DDE2E5"))
        }

    }
}
