package com.lukmannudin.academy.data

/**
 * Crafted by Lukman on 01/05/2021.
 **/
data class CourseEntity(
    var courseId: String,
    var title: String,
    var description: String,
    var deadline: String,
    var bookmarked: Boolean = false,
    var imagePath: String
)