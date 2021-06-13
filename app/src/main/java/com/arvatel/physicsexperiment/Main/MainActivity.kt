package com.arvatel.physicsexperiment.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.arvatel.physicsexperiment.DescriptionActivity
import com.arvatel.physicsexperiment.R
import com.arvatel.physicsexperiment.database.AppDatabase
import com.arvatel.physicsexperiment.database.SlidingDao
import com.arvatel.physicsexperiment.database.SlidingEntity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao : SlidingDao = AppDatabase.getInstance(this).slidingDao

        val entity = SlidingEntity(0, 0, 0, 0, "brom")

        lifecycleScope.launch {
            dao.insertAll(entity)
        }
        ex1.setOnClickListener{
            navigateToExperiment()
        }

        ex2.setOnClickListener{
            showSmth()
        }
    }

    override fun onResume() {
        presenter.onResume()
        super.onResume()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showSmth() {
        presenter.askForExperiment()

        Toast.makeText(this, "I did it", Toast.LENGTH_LONG).show()
    }

    override fun navigateToExperiment() {
        startActivity(Intent(this, DescriptionActivity::class.java))
    }
}