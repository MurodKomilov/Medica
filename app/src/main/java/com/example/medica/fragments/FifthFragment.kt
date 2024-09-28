package com.example.medica.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medica.R
import com.example.medica.databinding.FragmentFifthBinding


class FifthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentFifthBinding.inflate(inflater)

        binding.nextBtn.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,LetsYouInFragment())?.commit()
        }


        return binding.root
    }

}