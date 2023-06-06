package com.example.onlineshoppingmanagement.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.onlineshoppingmanagement.R


// orderData list is actually customer data list
class CustomerAdapter(
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
        val view = inflater.inflate(R.layout.item_customer, parent, false)

        val cID: TextView = view.findViewById(R.id.tvCustId)
        val cName: TextView = view.findViewById(R.id.tvCustName)
        val cAddress: TextView = view.findViewById(R.id.tvCustAddress)
        val  cEmail: TextView = view.findViewById(R.id.tvCustEmail)
        cID.text = orderData[0][position]
        cName.text = orderData[1][position]
        cAddress.text = orderData[2][position]
        cEmail.text = orderData[3][position]


        /* Create table Orders(
Create table Customer(
CID int primary key,
name varchar(30) not null,
address varchar(100) not null,
mail varchar(40) not null
);
);
*/



        return view
    }
}