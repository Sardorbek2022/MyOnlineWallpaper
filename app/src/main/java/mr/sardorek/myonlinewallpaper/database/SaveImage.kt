package mr.sardorek.myonlinewallpaper.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="SaveImage")
data class SaveImage(
    @PrimaryKey()
    val imageId:String,
    val url:String,
    val title:String
)
/*
@Entity(tableName = "SavedImage")
data class SaveImage(

    @PrimaryKey()
    val imageId: String,
    val url: String,
    val title: String
)*/