package com.example.praktikum4

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class BerandaFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_beranda, container, false)
        val BtnMulaiBeranda = view.findViewById<Button>(R.id.BtnMulaiBeranda)
        BtnMulaiBeranda.setOnClickListener {
            (activity as Latihan3).bukaLatihan4()
        }

        return view
    }
}
