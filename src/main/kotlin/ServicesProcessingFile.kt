import java.io.File

class ServicesProcessingFile {

    companion object {
        private val listIp = ListIp()
        @JvmStatic fun run (file :File): Long {
            try {
                file.forEachLine { line ->
                    listIp.add(line)
                }
            } catch (e: Exception) {
                println(e)
            }
            return listIp.total()
        }
    }
}