package com.loguito.clase3_1.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.loguito.clase3_1.R

class DetailFragment : Fragment(R.layout.fragment_detail) {
    private val arguments: DetailFragmentArgs by navArgs()

    private lateinit var userNameTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userNameTextView = view.findViewById(R.id.textView)
        userNameTextView.text = arguments.user.userName
    }
}