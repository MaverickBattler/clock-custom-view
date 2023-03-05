package com.task.clockusageexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import com.task.clockcustomview.ClockView

class SecondExampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_example, container, false)
        // Clicking on the button makes the second hand change color
        // You can check that view instance state is saved by changing the second hand color,
        // rotating the screen and seeing that the color you picked was saved
        val button = view.findViewById<Button>(R.id.run_oks_button)
        button.setOnClickListener {
            val clock = view.findViewById<ClockView>(R.id.clockView_oks)
            if (clock.secondHandColor == ContextCompat.getColor(requireActivity(), R.color.black))
                clock.secondHandColor = ContextCompat.getColor(requireActivity(), R.color.bright_red)
            else
                clock.secondHandColor = ContextCompat.getColor(requireActivity(), R.color.black)
        }
        return view
    }
}