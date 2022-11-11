package com.example.criminalintent

import android.icu.text.CaseMap
import java.util.*
import java.util.Date

data class Crime (var id: UUID = UUID.randomUUID())  {
    var title:String = ""
    var date: Date? = null
    var isSolved: Boolean? = null
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean):this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
    }
}