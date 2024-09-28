package com.example.medica.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medica.R
import com.example.medica.databinding.FragmentCreateAccountBinding


class CreateAccountFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentCreateAccountBinding.inflate(inflater)


        return binding.root

    }


}