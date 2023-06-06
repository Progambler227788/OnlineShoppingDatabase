package com.example.onlineshoppingmanagement


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlineshoppingmanagement.Adapters.TableAdapter
import com.example.onlineshoppingmanagement.databinding.ActivityTablesBinding


class Tables : AppCompatActivity() {
    private  lateinit var binding : ActivityTablesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTablesBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val tables = arrayOf( "Category",
//            "Customers", "CustomerPhones", "Employees", "Offers", "OrderedProducts",
//            "Orders", "paymentMethods", "ProductOffers", "Products", "Vendors"
//        )
        val tables = arrayOf( "Category",
            "Customers", "Orders", "Products" )
        val adapter = TableAdapter(this, tables)
        binding.tables.adapter = adapter

    }
}
