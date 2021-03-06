package com.lukmannudin.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by Lukmannudin on 5/6/21.
 */

@Parcelize
data class CourseResponse(
    var id: String,
    var title: String,
    var description: String,
    var date: String,
    var imagePath: String
) : Parcelable