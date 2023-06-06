package com.example.onlineshoppingmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineshoppingmanagement.Adapters.CategoryAdapter
import com.example.onlineshoppingmanagement.Adapters.OrderAdapter
import com.example.onlineshoppingmanagement.databinding.FragmentOrdersBinding


class OrdersFragment : Fragment() {
    private lateinit var binding: FragmentOrdersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOrdersBinding.inflate(inflater,container,false)
        val myData = DatabaseFunctions().callOrdersDataFunction()
        val arrayAdapter = OrderAdapter(requireContext(), myData)
        binding.ordersTable.adapter = arrayAdapter
        // Inflate the layout for this fragment
        return binding.root
    }

}