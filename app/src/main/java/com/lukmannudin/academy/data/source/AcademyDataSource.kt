package com.lukmannudin.academy.data.source

import androidx.lifecycle.LiveData
import com.lukmannudin.academy.data.CourseEntity
import com.lukmannudin.academy.data.ModuleEntity

/**
 * Created by Lukmannudin on 5/6/21.
 */


interface AcademyDataSource {
    fun getAllCourses(): LiveData<List<CourseEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun getCourseWithModules(courseId: String): LiveData<CourseEntity>

    fun getAllModulesByCourse(courseId: String): LiveData<List<ModuleEntity>>

    fun getContent(courseId: String, moduleId: String): LiveData<ModuleEntity>
}