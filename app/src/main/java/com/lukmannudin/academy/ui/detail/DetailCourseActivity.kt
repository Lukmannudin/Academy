package com.lukmannudin.academy.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lukmannudin.academy.R
import com.lukmannudin.academy.databinding.ActivityDetailCourseBinding
import com.lukmannudin.academy.databinding.ContentDetailCourseBinding

class DetailCourseActivity : AppCompatActivity() {

    private lateinit var detailContentBinding: ContentDetailCourseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailCourseBinding = ActivityDetailCourseBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailCourseBinding.detailContent

        setContentView(activityDetailCourseBinding.root)

        setSupportActionBar(activityDetailCourseBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        const val EXTRA_COURSE = "extra_course"
    }
}