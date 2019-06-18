package com.dicoding.picodiploma.myintentapp

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by sidiqpermana on 9/11/16.
 */
class Person : Parcelable {

    var name: String? = null
    var age: Int = 0
    var email: String? = null
    var city: String? = null

    /*
    Beberapa kode di bawah ini hasil generate dari plugins parcelable
     */
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(this.name)
        dest.writeInt(this.age)
        dest.writeString(this.email)
        dest.writeString(this.city)
    }

    constructor() {}

    protected constructor(`in`: Parcel) {
        this.name = `in`.readString()
        this.age = `in`.readInt()
        this.email = `in`.readString()
        this.city = `in`.readString()
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}
