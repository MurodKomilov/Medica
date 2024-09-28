package com.example.medica.fragments

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.medica.R
import com.example.medica.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFirstBinding.inflate(inflater)




        Handler().postDelayed({
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container, SecondFragment())?.commit()
        },3000)

        return binding.root

    }


}