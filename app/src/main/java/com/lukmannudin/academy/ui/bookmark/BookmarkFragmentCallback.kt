package com.lukmannudin.academy.ui.bookmark

import com.lukmannudin.academy.data.CourseEntity

/**
 * Crafted by Lukman on 01/05/2021.
 **/
interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}