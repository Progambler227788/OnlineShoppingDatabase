package com.example.onlineshoppingmanagement.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.onlineshoppingmanagement.R

class CategoryAdapter(
    private val context: Context,
    private val categoryData: List<List<String>>
) : BaseAdapter() {

    override fun getCount(): Int {
        return categoryData[0].size
    }

    override fun getItem(position: Int): Any {
        return categoryData[0][position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_category, parent, false)

        val catIdTextView: TextView = view.findViewById(R.id.catId)
        val catNameTextView: TextView = view.findViewById(R.id.catName)

        catIdTextView.text = categoryData[0][position]
        catNameTextView.text = categoryData[1][position]

        return view
    }
}