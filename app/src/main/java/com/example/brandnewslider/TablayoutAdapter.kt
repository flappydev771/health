package com.example.brandnewslider

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class TablayoutAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var frags:MutableList<Fragment> = ArrayList()
    private var titles:MutableList<String> = ArrayList()

    override fun getCount(): Int {
       return frags.size
    }

    override fun getItem(position: Int): Fragment {
        return frags[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

    fun add(fragment: Fragment,title:String){
        frags.add(fragment)
        titles.add(title)

    }

}