package com.example.mvppractice.util

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.replace(@IdRes frameId: Int, fragment:Fragment, tag: String?) {
    supportFragmentManager.beginTransaction().replace(frameId, fragment, tag).commit()
}