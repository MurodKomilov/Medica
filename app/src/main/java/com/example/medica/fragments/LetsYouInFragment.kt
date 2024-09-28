package com.example.medica.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medica.R
import com.example.medica.databinding.FragmentLetsYouInBinding
import kotlin.concurrent.fixedRateTimer


class LetsYouInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLetsYouInBinding.inflate(inflater)


        binding.button.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,CreateAccountFragment())?.commit()
        }




        return binding.root
    }


}