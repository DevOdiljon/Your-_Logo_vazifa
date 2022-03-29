package com.example.yourlogo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.yourlogo.fragment.TextFragment
import com.example.yourlogo.model.Member

class CustomAdapter(var members: ArrayList<Member>, var fm: FragmentManager):FragmentStatePagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return members.size
    }

    override fun getItem(position: Int): Fragment {
        return TextFragment.newInstance(members[position].tv_text_name, members[position].tv_text_about)
    }

}
