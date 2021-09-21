package com.jejec.stayactive

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication: Application()
/**
 * This class will notice your app to use Dagger-Hilt
 * as Dependencies Injection tools
 *
 * Dagger is compile-time injected, it means when you launch
 * the app it is already clear which Dependencies will be injected
 * into which classes
 *
 * You just need to annotate this application class to mark
 * your application as injectable
 *
 * The true power of Dagger is in the generated code
 * because of this annotation "@HiltAndroidApp" Dagger-Hilt
 * will generate a whole bunch of code files behind the scenes
 *
 * To generate that code you have to rebuild your project
 * */