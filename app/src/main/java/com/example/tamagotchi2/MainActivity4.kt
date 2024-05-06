import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tamagotchi2.R

class MainActivity : AppCompatActivity() {

    private lateinit var imgPet: ImageView
    private lateinit var btnFeed: Button
    private lateinit var btnClean: Button
    private lateinit var btnPlay: Button
    private lateinit var tvStatus: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        val imgPet = findViewById<ImageView>(R.id.imageView)
        val btn5 = findViewById<Button>(R.id.button5)
        val btnClean = findViewById<Button>(R.id.button6)
        val btnPlay = findViewById<Button>(R.id.button7)


        // Set initial pet image
        imgPet.setImageResource(R.drawable._c3ecf596ef329af1a5b7544158458d9)

        // Set click listeners
        btnFeed.setOnClickListener { performFeedAction() }
        btnClean.setOnClickListener { performCleanAction() }
        btnPlay.setOnClickListener { performPlayAction() }
    }

    private fun performFeedAction() {
        // Change pet image to feeding action icon
        imgPet.setImageResource(R.drawable.hungry_dog)
        // Update status values
        tvStatus.text = "Health: 90, Hunger: 30, Cleanliness: 80"
    }

    private fun performCleanAction() {
        // Change pet image to cleaning action icon
        imgPet.setImageResource(R.drawable.dog_bathing)
        // Update status values
        tvStatus.text = "Health: 95, Hunger: 20, Cleanliness: 100"
    }

    private fun performPlayAction() {
        // Change pet image to playing action icon
        imgPet.setImageResource(R.drawable.happy_dog)
        // Update status values
        tvStatus.text = "Health: 100, Hunger: 25, Cleanliness: 90"
    }
}