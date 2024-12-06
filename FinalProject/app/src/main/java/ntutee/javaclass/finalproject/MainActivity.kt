package ntutee.javaclass.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ntutee.javaclass.finalproject.R
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, 0, systemBars.right, 0)
            insets
        }
        findViewById<Button>(R.id.btn_Start).setOnClickListener{
            startActivity(Intent(this, Game::class.java));
        }

        findViewById<Button>(R.id.btn_Info).setOnClickListener{

        }

        findViewById<Button>(R.id.btn_Exit).setOnClickListener{
            exitProcess(0);
        }

    }
}