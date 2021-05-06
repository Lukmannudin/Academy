package com.lukmannudin.academy.di

import android.content.Context
import com.lukmannudin.academy.data.source.AcademyRepository
import com.lukmannudin.academy.data.source.remote.RemoteDataSource
import com.lukmannudin.academy.utils.JsonHelper

/**
 * Created by Lukmannudin on 5/6/21.
 */


object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}