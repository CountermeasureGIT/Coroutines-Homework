package otus.homework.coroutines

import com.google.gson.annotations.SerializedName


data class CatPhoto(
    @field:SerializedName("file")
    val file: String
)