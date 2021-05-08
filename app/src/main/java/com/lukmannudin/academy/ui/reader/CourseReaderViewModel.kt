package com.lukmannudin.academy.ui.reader

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.lukmannudin.academy.data.ContentEntity
import com.lukmannudin.academy.data.ModuleEntity
import com.lukmannudin.academy.data.source.AcademyRepository
import com.lukmannudin.academy.utils.DataDummy

/**
 * Crafted by Lukman on 01/05/2021.
 **/
class CourseReaderViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): LiveData<List<ModuleEntity>> =
        academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): LiveData<ModuleEntity> =
        academyRepository.getContent(courseId, moduleId)

}