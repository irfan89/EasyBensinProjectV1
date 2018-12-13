package payment

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.irfan.easybensinv1.main.NavigationDrawer
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_payment.*
import location.LocationActivity

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        imgHomePayment.setOnClickListener {
            startActivity(Intent(applicationContext, NavigationDrawer::class.java))
        }
        imgBackPayment.setOnClickListener {
            super.onBackPressed()
        }
        tvPaymentTFuel.text = intent.getStringExtra("tFuel")
        tvFuelPrice.text = intent.getStringExtra("Price")
        tvSumPrice.text = intent.getStringExtra("Price")
        tvPaymentLiter.text = intent.getStringExtra("sLiter")
        tvTotalPayment.text = intent.getStringExtra("Price")

        clPaymentBayar.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Payment Affirmation")
            builder.setMessage("Jumlah tagihan pembayaran Anda IDR " + tvTotalPayment.text.toString() + " , lanjutkan pembayaran?")
            builder.setPositiveButton("YES") { _, _ ->
                Toast.makeText(applicationContext, "Pembayaran Selesai", Toast.LENGTH_SHORT).show()
                startActivity(Intent(applicationContext, LocationActivity::class.java))
            }
            builder.setNegativeButton("No") { dialog, which ->
                Toast.makeText(applicationContext, "Pembayaran dibatalkan", Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

    }

}
