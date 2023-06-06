package com.example.onlineshoppingmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineshoppingmanagement.Adapters.ProductAdapter
import com.example.onlineshoppingmanagement.databinding.FragmentProductBinding


class ProductFragment : Fragment() {
    private lateinit var binding : FragmentProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =  FragmentProductBinding.inflate(inflater, container, false)
        val data = DatabaseFunctions().callProductDataFunction()
        val adapter = ProductAdapter(requireContext(),data)
        binding.productTable.adapter = adapter

        return binding.root
    }

}