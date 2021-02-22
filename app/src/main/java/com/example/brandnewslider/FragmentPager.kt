package com.example.brandnewslider

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPager(fm: FragmentManager,fragments: List<Fragment>) : FragmentPagerAdapter(fm) {

    val getFragment:List<Fragment> = fragments


    override fun getCount(): Int {
        return getFragment.size
    }

    override fun getItem(position: Int): Fragment {

        return getFragment.get(position)

    }
}