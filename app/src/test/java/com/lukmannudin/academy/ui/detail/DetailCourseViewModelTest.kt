package com.lukmannudin.academy.ui.detail

import com.lukmannudin.academy.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailCourseViewModelTest {

    private lateinit var viewModel: DetailCourseViewModel
    private val dummyCourse = DataDummy.generateDummyCourses()[0]
    private val courseId = dummyCourse.courseId

    @Before
    fun setup() {
        viewModel = DetailCourseViewModel()
        viewModel.setSelectedCourse(courseId)
    }

    @Test
    fun getCourse() {
        val course = viewModel.getCourse()
        assertNotNull(course)

        assertEquals(dummyCourse.courseId, course.courseId)
        assertEquals(dummyCourse.deadline, course.deadline)
        assertEquals(dummyCourse.description, course.description)
        assertEquals(dummyCourse.imagePath, course.imagePath)
        assertEquals(dummyCourse.title, course.title)
    }

    @Test
    fun getModules() {
        val modules = viewModel.getModules()
        assertNotNull(modules)
        assertEquals(7, modules.size.toLong())
    }
}