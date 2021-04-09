import java.io.File

class ServicesProcessingFile {
    companion object {
        private val listIp = ListIp()
        @JvmStatic fun run (file :File): String {
            return try {
                file.forEachLine { line ->
                    listIp.add(line)
                }
                "Количество уникальных ip ${listIp.total()}"
            } catch (e: Exception) {
                "неверно указан путь: ${e.message}"
            }
        }
    }
}