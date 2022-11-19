package mr.sardorek.myonlinewallpaper.reletedcollection

import mr.sardorek.myonlinewallpaper.model.Urls


data class SinglePhoto(
    val id: String,
    val urls: Urls,
    val likes: Long,
    val related_collections: RelatedCollections,
)
