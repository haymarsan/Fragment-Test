package com.haymarsan.fragmentshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.haymarsan.fragmentshow.Fragment.GoogleFragment
import com.haymarsan.fragmentshow.Fragment.JavaFragment
import com.haymarsan.fragmentshow.Fragment.MindorksFragment
import com.haymarsan.fragmentshow.adapter.IntroViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val adapter = IntroViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(GoogleFragment(), "Google")
        adapter.addFragment(MindorksFragment(), "Mindorks")
        adapter.addFragment(JavaFragment(), "Java")
        vpIntro.adapter = adapter
        tabs.setupWithViewPager(vpIntro)


//        var introViewPagerAdapter = IntroViewPagerAdapter(supportFragmentManager)
//        vpIntro.adapter = introViewPagerAdapter
//
//
//        val bg_color = resources.getIntArray(R.array.bg_color)
//            vpIntro.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
//            override fun onPageScrollStateChanged(state: Int) {}override fun onPageSelected(position: Int) {}override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
//                vpIntro.setBackgroundColor(bg_color[position])
//            }
//        })

    }
}
