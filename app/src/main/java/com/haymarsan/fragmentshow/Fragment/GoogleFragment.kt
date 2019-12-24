package com.haymarsan.fragmentshow.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.haymarsan.fragmentshow.R
import kotlinx.android.synthetic.main.fragment_google.view.*

class GoogleFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.fragment_google, container, false)!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.wvGoogle.loadUrl("https://www.google.com/")
    }

}