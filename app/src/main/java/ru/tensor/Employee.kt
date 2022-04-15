package ru.tensor

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Employee(
    val surname: String,
    val name: String,
    val patronymic: String?,
    val position: String,
    val achievements: String,
    val email: String
) : Parcelable {
    val fullName: String
        get() = "$surname $name ${patronymic ?: ""}"
}