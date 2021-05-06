package com.lukmannudin.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by Lukmannudin on 5/6/21.
 */

@Parcelize
data class ModuleResponse(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int
) : Parcelable