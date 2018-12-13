package profil

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.irfan.easybensinv1.main.NavigationDrawer
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_profil.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        imgHomeProfil.setOnClickListener {
            startActivity(Intent(applicationContext, NavigationDrawer::class.java))
        }
    }

}
