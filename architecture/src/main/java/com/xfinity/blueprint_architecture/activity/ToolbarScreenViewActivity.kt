package com.xfinity.blueprint_architecture.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xfinity.blueprint.presenter.ScreenPresenter
import com.xfinity.blueprint_architecture.ToolbarScreenView
import com.xfinity.blueprint_architecture.ToolbarScreenViewArchitect

abstract class ToolbarScreenViewActivity : AppCompatActivity() {
    @Suppress("MemberVisibilityCanBePrivate")
    lateinit var architect: ToolbarScreenViewArchitect
    lateinit var screenViewActivityDelegate: ScreenViewActivityDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenViewActivityDelegate.onCreate(this, architect)
    }

    abstract fun getPresenter(): ScreenPresenter<ToolbarScreenView>
}