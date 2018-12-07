package order

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import com.example.irfan.easybensinv1.main.NavigationDrawer
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_order_data_input.*


class OrderDataInputActivity : AppCompatActivity() {

    private val adapter = DataInputTabAdapter(supportFragmentManager)
    private var mLiter = 0
    private var cBtnState1 = 0
    private var cBtnState2 = 0
    private val Price = arrayOf(8500, 9000, 9500)
    private var mPrice = 0
    private var currentPage = 0
    var sColor = R.color.orderBlack

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_data_input)

        adapter.addFragment(OrderRegulerFragment(), "Regular")
        adapter.addFragment(OrderPlusFragment(), "Plus")
        adapter.addFragment(OrderSupremeFragment(), "Supreme")
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
                clearBtnState(cBtnState1)
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                // Check if this is the page you want.
            }
        })

        imgNextPage.setOnClickListener {
            currentPage = viewPager.currentItem
            if (currentPage <= viewPager.childCount) {
                viewPager.setCurrentItem(++currentPage, true)
            }
        }
        imgBackPage.setOnClickListener {
            currentPage = viewPager.currentItem
            if (currentPage > 0) {
                viewPager.setCurrentItem(--currentPage, true)
            }
        }
        tvJumlahLiter.setOnClickListener { view ->
            Snackbar.make(
                view, "Reguler " + mLiter.toString() + " Liter | IDR " + mPrice + ",- " +
                        "                                  BAYAR",
                Snackbar.LENGTH_LONG
            ).setAction("Action", null).show()
        }

        btnHomeIcon.setOnClickListener {
            startActivity(Intent(applicationContext, NavigationDrawer::class.java))
        }

        btn5L.setOnClickListener { view ->
            mLiter = 5
            cBtnState2 = cBtnState1
            cBtnState1 = mLiter
            buttonState()
            clearBtnState(cBtnState2)
            mPrice = mLiter * Price[0]
            tvJumlahLiter.text = btn5L.text.toString()
            showBill()
        }
        btn10L.setOnClickListener { view ->
            mLiter = 10
            cBtnState2 = cBtnState1
            cBtnState1 = mLiter
            buttonState()
            clearBtnState(cBtnState2)
            mPrice = mLiter * Price[0]
            tvJumlahLiter.text = btn10L.text.toString()
            showBill()
        }
        btn15L.setOnClickListener { view ->
            mLiter = 15
            cBtnState2 = cBtnState1
            cBtnState1 = mLiter
            buttonState()
            clearBtnState(cBtnState2)
            mPrice = mLiter * Price[0]
            tvJumlahLiter.text = btn15L.text.toString()
            showBill()
        }
        btn20L.setOnClickListener { view ->
            mLiter = 20
            cBtnState2 = cBtnState1
            cBtnState1 = mLiter
            buttonState()
            clearBtnState(cBtnState2)
            mPrice = mLiter * Price[0]
            tvJumlahLiter.text = btn20L.text.toString()
            showBill()
        }

        btn25L.setOnClickListener { view ->
            mLiter = 25
            cBtnState2 = cBtnState1
            cBtnState1 = mLiter
            buttonState()
            clearBtnState(cBtnState2)
            mPrice = mLiter * Price[0]
            tvJumlahLiter.text = btn25L.text.toString()
            showBill()
        }
    }

    private fun showBill() {
        val snack = Snackbar.make(
            viewPager, "Reguler " + mLiter.toString() + " Liter | IDR " + mPrice + ",- " +
                    "                                  BAYAR", Snackbar.LENGTH_LONG
        ).setAction("Action", null)
        snack.view.setBackgroundColor(ContextCompat.getColor(applicationContext, sColor))
        snack.show()
    }

    private fun buttonState() {
        var draw = R.drawable.button_order_reguler
        currentPage = viewPager.currentItem

        when (currentPage) {
            0 -> {
                draw = R.drawable.button_order_reguler
                sColor = R.color.orderBlack
            }
            1 -> {
                draw = R.drawable.button_order_plus
                sColor = R.color.orderBlue
            }
            2 -> {
                draw = R.drawable.button_order_supreme
                sColor = R.color.orderRed
            }
        }
        when (mLiter) {
            5 -> {
                btn5L.setBackgroundResource(draw)
                btn5L.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorWhite))
            }
            10 -> {
                btn10L.setBackgroundResource(draw)
                btn10L.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorWhite))
            }
            15 -> {
                btn15L.setBackgroundResource(draw)
                btn15L.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorWhite))
            }
            20 -> {
                btn20L.setBackgroundResource(draw)
                btn20L.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorWhite))
            }
            25 -> {
                btn25L.setBackgroundResource(draw)
                btn25L.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorWhite))
            }
        }
    }

    private fun clearBtnState(state: Int) {
        if (state != 0) {
            when (state) {
                5 -> {
                    btn5L.setBackgroundResource(R.drawable.button_order)
                    btn5L.setTextColor(Color.BLACK)
                }
                10 -> {
                    btn10L.setBackgroundResource(R.drawable.button_order)
                    btn10L.setTextColor(Color.BLACK)
                }
                15 -> {
                    btn15L.setTextColor(Color.BLACK)
                    btn15L.setBackgroundResource(R.drawable.button_order)
                }
                20 -> {
                    btn20L.setTextColor(Color.BLACK)
                    btn20L.setBackgroundResource(R.drawable.button_order)
                }
                25 -> {
                    btn25L.setTextColor(Color.BLACK)
                    btn25L.setBackgroundResource(R.drawable.button_order)
                }
            }
        }
    }

}