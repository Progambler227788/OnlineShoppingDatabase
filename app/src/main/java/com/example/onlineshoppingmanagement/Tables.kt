package com.example.onlineshoppingmanagement

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import com.example.onlineshoppingmanagement.Adapters.TableAdapter
import com.example.onlineshoppingmanagement.databinding.ActivityMainScreenBinding
import com.example.onlineshoppingmanagement.databinding.ActivityTablesBinding


class Tables : AppCompatActivity() {
    private  lateinit var binding : ActivityTablesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTablesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val tables = arrayOf( "Category",
            "Customer", "CustomerPhone", "Employee", "Offer", "OrderedProduct",
            "Orders", "paymentMethod", "ProductOffer", "Product", "Vendor"
        )
        val adapter = TableAdapter(this, tables)
        binding.tables.adapter = adapter

    }
}
