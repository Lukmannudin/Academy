package com.lukmannudin.academy.data.source.remote

import com.lukmannudin.academy.data.source.remote.response.ContentResponse
import com.lukmannudin.academy.data.source.remote.response.CourseResponse
import com.lukmannudin.academy.data.source.remote.response.ModuleResponse
import com.lukmannudin.academy.utils.JsonHelper

/**
 * Created by Lukmannudin on 5/6/21.
 */


class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllCourses(): List<CourseResponse> = jsonHelper.loadCourses()

    fun getModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)

    fun getContent(moduleId: String): ContentResponse = jsonHelper.loadContent(moduleId)
}