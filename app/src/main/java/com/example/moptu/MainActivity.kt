package com.example.moptu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.top_app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.poland_action -> {
                Log.i("menuItemClicked", "poland")
                true
            }
            R.id.france_action -> {
                Log.i("menuItemClicked", "france")
                true
            }
            R.id.turkey_action -> {
                Log.i("menuItemClicked", "turkey")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}