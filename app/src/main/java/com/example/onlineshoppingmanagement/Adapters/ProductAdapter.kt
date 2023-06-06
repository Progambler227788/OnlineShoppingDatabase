package com.example.onlineshoppingmanagement.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.onlineshoppingmanagement.R
// orderData list is actually product data list
class ProductAdapter(
    private val context: Context,
    private val orderData: List<List<String>>
) : BaseAdapter() {

    override fun getCount(): Int {
        return orderData[0].size
    }

    override fun getItem(position: Int): Any {
        return orderData[0][position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_product, parent, false)

        val pID: TextView = view.findViewById(R.id.tvPrId)
        val name: TextView = view.findViewById(R.id.tvPrName)
        val brand: TextView = view.findViewById(R.id.tvPrBrand)
        val desp: TextView = view.findViewById(R.id.tvPrGender)
        val gender : TextView = view.findViewById(R.id.tvPrDescription)
        val price : TextView = view.findViewById(R.id.tvPrPrice)
        val vendorId : TextView = view.findViewById(R.id.tvPrVendorID)
        val cartId : TextView = view.findViewById(R.id.tvPrCartID)
        pID.text = orderData[0][position]
        name.text = orderData[1][position]
        brand.text = orderData[2][position]
        desp.text = orderData[3][position]
        gender.text = orderData[4][position]
        price.text = orderData[5][position]
        vendorId.text = orderData[6][position]
        cartId.text = orderData[7][position]

  /*
  Create table Product(
productID int primary key,
Name varchar(20) not null,
brand varchar(20) not null,
description  varchar(50) not null,
gender varchar(20) not null,
price float not null,
vendorID int not null,
cartID int not null,
foreign key (vendorID) references vendor(vendorID),
foreign key (cartID) references category(cartID)
);
*/



        return view
    }
}