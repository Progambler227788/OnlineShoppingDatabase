package com.example.onlineshoppingmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineshoppingmanagement.Adapters.CategoryAdapter
import com.example.onlineshoppingmanagement.Adapters.CustomerAdapter
import com.example.onlineshoppingmanagement.databinding.FragmentCustomerBinding


class CustomerFragment : Fragment() {
    private lateinit var binding : FragmentCustomerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCustomerBinding.inflate(inflater,container,false)
        val myData = DatabaseFunctions().callCustomerDataFuntion()
        val arrayAdapter = CustomerAdapter(requireContext(), myData)
        binding.customersTable.adapter = arrayAdapter

        return binding.root
    }

}