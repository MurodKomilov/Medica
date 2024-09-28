package com.example.medica.fragments

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.medica.R


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)


        Handler().postDelayed({
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,ThirdFragment())?.commit()
        },3000)

        return view
    }

}