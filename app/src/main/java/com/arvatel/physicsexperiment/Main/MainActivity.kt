package com.arvatel.physicsexperiment.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arvatel.physicsexperiment.DescriptionActivity
import com.arvatel.physicsexperiment.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ex1.setOnClickListener{
            navigateToExperiment()
        }

        ex2.setOnClickListener{
            showSmth()
        }
    }

    override fun showSmth() {
        presenter.askForExperiment()
        Toast.makeText(this, "I did it", Toast.LENGTH_LONG).show()
    }

    override fun navigateToExperiment() {
        startActivity(Intent(this, DescriptionActivity::class.java))
    }
}