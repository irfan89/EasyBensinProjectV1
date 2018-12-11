package history

import android.os.Bundle
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_history.*
import order.DataInputTabAdapter


class OrderHistoryActivity : AppCompatActivity() {

    private val adapter = DataInputTabAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        adapter.addFragment(OrderHistory(), "History")
        adapter.addFragment(OrderReceipt(), "Receipt")
        adapter.addFragment(OrderFeedback(), "Feedback")
        viewPagerHist.adapter = adapter
        tabLayoutHist.setupWithViewPager(viewPagerHist)

        viewPagerHist.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                // Check if this is the page you want.
            }
        })

        imgBackHome.setOnClickListener {
            super.onBackPressed()
        }

    }

}