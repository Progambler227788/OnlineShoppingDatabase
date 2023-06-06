package com.example.onlineshoppingmanagement

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.onlineshoppingmanagement.Adapters.CategoryAdapter
import com.example.onlineshoppingmanagement.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {
    private lateinit var binding : FragmentCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =  FragmentCategoryBinding.inflate(inflater, container, false)
        val myData  = DatabaseFunctions().callCategoryDataFuntion()
        val arrayAdapter = CategoryAdapter(requireContext(), myData )
        binding.categoryTable.adapter = arrayAdapter

        return binding.root
    }

}

