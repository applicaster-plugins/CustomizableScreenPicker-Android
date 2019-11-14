package com.applicaster

import android.content.Context
import android.support.v4.app.Fragment

import com.applicaster.plugin_manager.screen.PluginScreen

import java.io.Serializable
import java.util.HashMap

class CustomizableScreenPickerPluginScreen : PluginScreen {

    override fun present(context: Context, screenMap: HashMap<String, Any>, dataSource: Serializable, isActivity: Boolean) {

    }

    override fun generateFragment(screenMap: HashMap<String, Any>, dataSource: Serializable?): Fragment {
        return CustomizableScreenPicker(screenMap, dataSource)
    }

    override fun generateTVFragment(screenMap: HashMap<String, Any>, dataSource: Serializable): android.app.Fragment? {
        return null
    }

    override fun getPresentationStyle(screenMap: HashMap<String, Any>): Int {
        return 0
    }
}