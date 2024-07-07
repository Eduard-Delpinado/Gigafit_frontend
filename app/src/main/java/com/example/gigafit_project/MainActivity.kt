package com.example.gigafit_project

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigafit_project.R.id.createedit
import com.example.gigafit_project.R.id.createedit1
import com.example.gigafit_project.R.id.home
import com.example.gigafit_project.R.id.main
import com.example.gigafit_project.R.id.myworkedit
import com.example.gigafit_project.R.id.selectedit
import com.example.gigafit_project.R.id.selectroutine
import com.example.gigafit_project.R.id.selectwork
import com.example.gigafit_project.R.id.setup
import com.example.gigafit_project.R.id.workout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.my_workout_edit)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(myworkedit)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}