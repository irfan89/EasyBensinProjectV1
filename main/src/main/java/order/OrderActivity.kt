package order

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val intent = Intent(this, OrderDataInputActivity::class.java)
        imgOrderReg.setOnClickListener {
            intent.putExtra("OrderPage", 0)
            startActivity(intent)
        }
        imgOrderPlus.setOnClickListener {
            intent.putExtra("OrderPage", 1)
            startActivity(intent)
        }
        imgOrderSupreme.setOnClickListener {
            intent.putExtra("OrderPage", 2)
            startActivity(intent)
        }
        imgOrderDiesel.setOnClickListener {
            intent.putExtra("OrderPage", 3)
            startActivity(intent)
        }

        imgBackHome.setOnClickListener {
            super.onBackPressed()
        }
    }
}
