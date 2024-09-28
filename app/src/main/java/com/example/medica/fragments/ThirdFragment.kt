package com.example.medica.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medica.R
import com.example.medica.databinding.FragmentFirstBinding
import com.example.medica.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentThirdBinding.inflate(inflater)

        binding.nextBtn.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,FourthFragment())?.commit()
        }

        return binding.root
    }

}