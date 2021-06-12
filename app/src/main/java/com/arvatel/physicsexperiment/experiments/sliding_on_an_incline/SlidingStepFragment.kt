package com.arvatel.physicsexperiment.experiments.sliding_on_an_incline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arvatel.physicsexperiment.R

/**
 * A simple [Fragment] subclass.
 * Use the [SlidingStepFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SlidingStepFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sliding_step, container, false)
    }

}