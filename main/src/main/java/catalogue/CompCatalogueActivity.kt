package catalogue

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.example.irfan.easybensinv1.main.NavigationDrawer
import com.example.irfan.easybensinv1.main.R
import kotlinx.android.synthetic.main.activity_company_catalog.*
import order.DataInputTabAdapter


class CompCatalogueActivity : AppCompatActivity() {

    private val adapter = DataInputTabAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_catalog)

        adapter.addFragment(CompCatRegular(), "Regular")
        adapter.addFragment(CompCatPlus(), "Plus")
        adapter.addFragment(CompCatSupreme(), "Supreme")
        adapter.addFragment(CompCatDiesel(), "Diesel")
        viewPagerCompCat.adapter = adapter
        circleIndCompCat.setViewPager(viewPagerCompCat)

        viewPagerCompCat.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                // Check if this is the page you want.
            }
        })

        imgBackHomeCat.setOnClickListener {
            super.onBackPressed()
        }
        imgHomeCat.setOnClickListener {
            startActivity(Intent(applicationContext, NavigationDrawer::class.java))
        }

    }

}