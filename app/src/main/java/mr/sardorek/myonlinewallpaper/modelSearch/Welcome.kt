package mr.sardorek.myonlinewallpaper.modelSearch


data class Welcome (
    val total: Long,
    val totalPages: Long,
    val results: List<Result>? = null
)
