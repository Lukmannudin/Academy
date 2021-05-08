package com.lukmannudin.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.lukmannudin.academy.data.CourseEntity
import com.lukmannudin.academy.data.source.AcademyRepository
import com.lukmannudin.academy.utils.DataDummy

/**
 * Crafted by Lukman on 01/05/2021.
 **/
class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<List<CourseEntity>> = academyRepository.getAllCourses()

}