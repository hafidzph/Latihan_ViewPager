package com.latihan.viewpagertask

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.latihan.viewpagertask.*

class PageAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 4;
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            3 -> FourthFragment()
            else -> {
                return FirstFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "First"
            }
            1 -> {
                return "Second"
            }
            2 -> {
                return "Third"
            }
            3 -> {
                return "Fourth"
            }
        }
        return super.getPageTitle(position)
    }
}