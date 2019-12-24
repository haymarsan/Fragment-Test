package com.haymarsan.fragmentshow.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.haymarsan.fragmentshow.R
import kotlinx.android.synthetic.main.fragment_google.view.*
import kotlinx.android.synthetic.main.fragment_java.view.*

class JavaFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.fragment_java, container, false)!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.wvJava.loadUrl("https://www.javatpoint.com/")
    }

}