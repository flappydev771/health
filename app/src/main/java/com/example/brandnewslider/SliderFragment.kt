package com.example.brandnewslider

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView




class SliderFragment : Fragment() {

    lateinit var titleTexView: TextView
    lateinit var timeTexView: TextView




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_slider, container, false)
        titleTexView = view.findViewById(R.id.titleText)
        timeTexView = view.findViewById(R.id.timeText)


        val title = arguments!!.getString("title")
        val time = arguments!!.getString("time")

        titleTexView.text = title
        timeTexView.text = time

        return view;

    }



    companion object {
        fun getInstance(title: String, time: String): SliderFragment {
            val fragment = SliderFragment()
            val bundle = Bundle()
            bundle.putString("title", title)
            bundle.putString("time", time)
            fragment.arguments = bundle
            return fragment
        }
    }


}