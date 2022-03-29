package com.example.yourlogo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.yourlogo.model.Member
import com.example.yourlogo.R
import com.example.yourlogo.adapter.CustomAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //initViews()
    }
    fun initViews(){
        initText()
    }
    fun initText(){
        var view_pager = findViewById<ViewPager>(R.id.view_pager)
        var tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        var members = prepareMemberList()
        var customAdapter  = CustomAdapter(members, supportFragmentManager)
        view_pager.adapter = customAdapter
        tabLayout.setupWithViewPager(view_pager)
    }

    fun prepareMemberList():ArrayList<Member>{
        var members = ArrayList<Member>()
        for (i in 0..2){
            members.add(Member("All Your Favourite Dishes", "Order nf,ceb qnbfqebfl cjqkhcqecvblec ckslbhcifqlbc qncm qkcbqei cqcjqeqice n cqjvcldcqjc"))
        }
        return members
    }
}