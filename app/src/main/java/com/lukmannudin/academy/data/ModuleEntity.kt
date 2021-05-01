package com.lukmannudin.academy.data

/**
 * Crafted by Lukman on 01/05/2021.
 **/
data class ModuleEntity(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
) {
    var contentEntity: ContentEntity? = null
}