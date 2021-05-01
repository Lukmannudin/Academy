package com.lukmannudin.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.lukmannudin.academy.data.CourseEntity
import com.lukmannudin.academy.data.ModuleEntity
import com.lukmannudin.academy.utils.DataDummy

/**
 * Crafted by Lukman on 01/05/2021.
 **/
class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}