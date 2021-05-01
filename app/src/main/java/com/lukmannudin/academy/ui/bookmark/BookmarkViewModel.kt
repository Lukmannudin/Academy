package com.lukmannudin.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.lukmannudin.academy.data.CourseEntity
import com.lukmannudin.academy.utils.DataDummy

/**
 * Crafted by Lukman on 01/05/2021.
 **/
class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}