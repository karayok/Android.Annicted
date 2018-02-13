package io.github.karageageta.annicted

import android.app.Application
import io.github.karageageta.annicted.di.component.ApplicationComponent
import io.github.karageageta.annicted.di.module.ApplicationModule
import io.github.karageageta.annicted.di.component.DaggerApplicationComponent

class AnnictedApplication : Application() {
    lateinit var component: ApplicationComponent
        private set

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}