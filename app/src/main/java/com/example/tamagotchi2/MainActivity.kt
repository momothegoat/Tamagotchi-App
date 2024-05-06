import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tamagotchi2.MainActivity
import com.example.tamagotchi2.R
import kotlinx.coroutines.MainScope




class WelcomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.button)
        btnStart.setOnClickListener {
            startActivity(Intent(this,MainActivity()::class.java))
            finish()
        }
    }
}