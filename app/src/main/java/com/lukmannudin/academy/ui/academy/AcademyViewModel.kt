package com.lukmannudin.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.lukmannudin.academy.data.CourseEntity
import com.lukmannudin.academy.utils.DataDummy

/**
 * Crafted by Lukman on 01/05/2021.
 **/
class AcademyViewModel : ViewModel() {
    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}