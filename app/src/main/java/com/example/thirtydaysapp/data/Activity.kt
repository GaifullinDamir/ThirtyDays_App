package com.example.thirtydaysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysapp.R

data class Activity (

    @DrawableRes
    val imageResourceId: Int,

    @StringRes
    val name: Int,

    val day: Int,

    @StringRes
    val description: Int,

)

val activities = listOf(
    Activity(R.drawable.image3, R.string.act_name_3, 17, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 18, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 19, R.string.descr),
    Activity(R.drawable.image6, R.string.act_name_6, 20, R.string.descr),
    Activity(R.drawable.image7, R.string.act_name_7, 21, R.string.descr),
    Activity(R.drawable.image1, R.string.act_name_1, 22, R.string.descr),
    Activity(R.drawable.image2, R.string.act_name_2, 23, R.string.descr),
    Activity(R.drawable.image1, R.string.act_name_1, 8, R.string.descr),
    Activity(R.drawable.image2, R.string.act_name_2, 23, R.string.descr),
    Activity(R.drawable.image3, R.string.act_name_3, 24, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 25, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 26, R.string.descr),
    Activity(R.drawable.image6, R.string.act_name_6, 27, R.string.descr),
    Activity(R.drawable.image7, R.string.act_name_7, 28, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 29, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 30, R.string.descr),
    Activity(R.drawable.image2, R.string.act_name_2, 9, R.string.descr),
    Activity(R.drawable.image3, R.string.act_name_3, 10, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 11, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 12, R.string.descr),
    Activity(R.drawable.image1, R.string.act_name_1, 1, R.string.descr),
    Activity(R.drawable.image2, R.string.act_name_2, 2, R.string.descr),
    Activity(R.drawable.image3, R.string.act_name_3, 3, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 4, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 5, R.string.descr),
    Activity(R.drawable.image6, R.string.act_name_6, 6, R.string.descr),
    Activity(R.drawable.image7, R.string.act_name_7, 7, R.string.descr),
    Activity(R.drawable.image6, R.string.act_name_6, 13, R.string.descr),
    Activity(R.drawable.image7, R.string.act_name_7, 14, R.string.descr),
    Activity(R.drawable.image1, R.string.act_name_1, 15, R.string.descr),
    Activity(R.drawable.image2, R.string.act_name_2, 16, R.string.descr),
    Activity(R.drawable.image3, R.string.act_name_3, 17, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 18, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 19, R.string.descr),
    Activity(R.drawable.image6, R.string.act_name_6, 20, R.string.descr),
    Activity(R.drawable.image7, R.string.act_name_7, 21, R.string.descr),
    Activity(R.drawable.image1, R.string.act_name_1, 22, R.string.descr),
    Activity(R.drawable.image2, R.string.act_name_2, 23, R.string.descr),
    Activity(R.drawable.image3, R.string.act_name_3, 24, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 25, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 26, R.string.descr),
    Activity(R.drawable.image6, R.string.act_name_6, 27, R.string.descr),
    Activity(R.drawable.image7, R.string.act_name_7, 28, R.string.descr),
    Activity(R.drawable.image4, R.string.act_name_4, 29, R.string.descr),
    Activity(R.drawable.image5, R.string.act_name_5, 30, R.string.descr),
)