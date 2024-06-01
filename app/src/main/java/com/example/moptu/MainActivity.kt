package com.example.moptu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    val homeFragment = HomeFragment()
    val polandFragment = PolandFragment()
    val franceFragment = FranceFragment()
    val turkeyFragment = TurkeyFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        setSupportActionBar(toolbar)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, homeFragment)
            commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.top_app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.poland_action -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, polandFragment)
                    commit()
                }
                true
            }
            R.id.france_action -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, franceFragment)
                    commit()
                }
                true
            }
            R.id.turkey_action -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, turkeyFragment)
                    commit()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}