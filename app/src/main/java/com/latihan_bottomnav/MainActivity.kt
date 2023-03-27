package com.latihan_bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.latihan_bottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.firstFragment -> setFragment(FragmentSatu())
                R.id.secondFragment -> setFragment(FragmentDua())
                R.id.thirdFragment -> setFragment(FragmentTiga())
            }
            true
        }



    }

    private fun setFragment(fragment:Fragment) =
            supportFragmentManager.beginTransaction().apply {
             replace(R.id.fragment_layout, fragment)
             commit()
      }

}