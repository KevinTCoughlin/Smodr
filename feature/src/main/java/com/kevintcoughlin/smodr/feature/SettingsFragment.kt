package com.kevintcoughlin.smodr.feature

import android.os.Bundle
import android.preference.PreferenceFragment
import android.preference.PreferenceManager

class SettingsFragment : PreferenceFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addPreferencesFromResource(R.xml.preferences)
        PreferenceManager.setDefaultValues(activity, R.xml.preferences, false)
    }
}
