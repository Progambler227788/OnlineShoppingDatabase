package com.example.onlineshoppingmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.onlineshoppingmanagement.databinding.ActivityShowFragmentsBinding

class ShowFragments : AppCompatActivity() {
    private lateinit var binding : ActivityShowFragmentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = intent.getStringExtra("tableName")
        if(data=="Category"){
            replaceFragment(CategoryFragment())
        }

    }
    private fun replaceFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.showTables,fragment).commit()
    }
}