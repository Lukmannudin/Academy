package com.lukmannudin.academy.data.source

import com.lukmannudin.academy.data.CourseEntity
import com.lukmannudin.academy.data.ModuleEntity

/**
 * Created by Lukmannudin on 5/6/21.
 */


interface AcademyDataSource {
    fun getAllCourses(): List<CourseEntity>

    fun getBookmarkedCourses(): List<CourseEntity>

    fun getCourseWithModules(courseId: String): CourseEntity

    fun getAllModulesByCourse(courseId: String): List<ModuleEntity>

    fun getContent(courseId: String, moduleId: String): ModuleEntity
}