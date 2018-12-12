package newsfeed

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import catalogue.News1
import catalogue.News2
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_newsfeed.*
import order.DataInputTabAdapter


class NewsfeedActivity : AppCompatActivity() {

    private val adapter = DataInputTabAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newsfeed)

        adapter.addFragment(News1(), "News1")
        adapter.addFragment(News2(), "News2")
        viewPagerNewsfeed.adapter = adapter
        circleIndNewsfeed.setViewPager(viewPagerNewsfeed)

        viewPagerNewsfeed.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                // Check if this is the page you want.
            }
        })

        imgBackHomeNewsfeed.setOnClickListener {
            super.onBackPressed()
        }

    }

}