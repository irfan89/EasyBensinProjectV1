package com.example.irfan.easybensinv1.main

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import comp_catalogue.CompCatalogueActivity
import history.OrderHistoryActivity
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import kotlinx.android.synthetic.main.app_bar_navigation_drawer.*
import order.OrderActivity

class NavigationDrawer : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        nav_view.itemIconTintList = null

        btnHomeOrder.setOnClickListener {
            startActivity(Intent(applicationContext, OrderActivity::class.java))
        }

        btnHomeHist.setOnClickListener {
            startActivity(Intent(applicationContext, OrderHistoryActivity::class.java))
        }

        clCompCat.setOnClickListener {
            startActivity(Intent(applicationContext, CompCatalogueActivity::class.java))
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_perusahaan -> {

            }
            R.id.nav_ttg_app -> {

            }
            R.id.nav_username -> {

            }
            R.id.nav_number -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
