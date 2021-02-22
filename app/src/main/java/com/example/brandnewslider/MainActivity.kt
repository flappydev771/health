package com.example.brandnewslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: FragmentPager
    private lateinit var pager: ViewPager
    private lateinit var tab:TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var tabAdapter: TablayoutAdapter

    var next: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab = findViewById(R.id.tablayout)
        viewPager = findViewById(R.id.viewPager)

        pager = findViewById(R.id.pager)
        adapter = FragmentPager(supportFragmentManager, getAllFragments())
        pager.adapter = adapter
        tabAdapter = TablayoutAdapter(supportFragmentManager)
        tabAdapter.add(AFragment(),"KD")
        tabAdapter.add(BFragment(),"Pad")


        viewPager.adapter = tabAdapter
        tab.setupWithViewPager(viewPager)




    }

    fun getAllFragments(): List<Fragment> {
        var fragments: MutableList<Fragment> = ArrayList()


        fragments.add(SliderFragment.getInstance("Get up early", "4:30 am"))
        fragments.add(SliderFragment.getInstance("Go to gym", "5:30 am"))
        fragments.add(SliderFragment.getInstance("Take medicine", "6:30 am"))
        fragments.add(SliderFragment.getInstance("Eat healthy food", "7:30 am"))
        fragments.add(SliderFragment.getInstance("Go to office", "8:30 am"))





        return fragments
    }


    fun left(view: View) {
        if(next>0){
            next = (next - 1)
            Log.e("slide no: ", "$next")
            pager.setCurrentItem(next, true)
        }
        else{
            next = 0
        }
    }
    fun right(view: View) {
        next = (next + 1) % 5
        Log.e("slide no: ", "$next")
        pager.setCurrentItem(next, true)


    }


}