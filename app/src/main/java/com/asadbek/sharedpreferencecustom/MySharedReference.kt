package com.asadbek.sharedpreferencecustom

import android.content.Context
import android.content.SharedPreferences

object MySharedReference {
    private const val NAME = "my_cache" // kesh nomi
    private const val MODE = Context.MODE_PRIVATE // keshga yozish turi
    private lateinit var sharedPreferences: SharedPreferences // sharedPreferences
    fun init(context: Context) { // initliz...
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }
    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }
    var name:String?
        get() = sharedPreferences.getString("ism","Bo`sh") // keshdagi ma`lumotni olish
        set(value) = sharedPreferences.edit {  // keshga malumotni saqlash
            it.putString("ism",value)
        }
}