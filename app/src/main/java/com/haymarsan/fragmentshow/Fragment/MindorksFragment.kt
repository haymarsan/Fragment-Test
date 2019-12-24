package com.haymarsan.fragmentshow.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.haymarsan.fragmentshow.R
import kotlinx.android.synthetic.main.fragment_google.view.*
import kotlinx.android.synthetic.main.fragment_mindorks.view.*

class MindorksFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.fragment_mindorks, container, false)!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.wvMindorks.loadUrl("https://medium.com/mindorks/learning-android-development-in-2019-a-practical-guide-ddc71e008696")
    }

}