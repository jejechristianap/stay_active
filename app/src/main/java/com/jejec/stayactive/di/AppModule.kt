package com.jejec.stayactive.di

import android.content.Context
import androidx.room.Room
import com.jejec.stayactive.db.RunningDatabase
import com.jejec.stayactive.other.Constant.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * This class will determine when the object inside your app module
 *  are created and when they are destroyed.
 *  It means we tell Android Studio or your app that it should
 *  Install this module inside of this component class
 * */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * This annotation "@Provides" will tell Dagger that the result of that function
     * can be used to create another dependencies and can be used to be
     * injected into your classes
     *
     * This annotation "@Singleton"
     * each class in your app that needs that running database will get the same instance
     * not multiple instances and you don't need to access to the database class instead
     * you need to access to its DAO object
     *
     */
    @Singleton
    @Provides
    fun provideRunningDatabase(
        // This annotation "@ApplicationContext" will insert the application context for this app
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    )

    /**
     * With Dagger when you provide running database "db" as parameter
     * Dagger will automatically recognize how it can construct it
     * */
    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}