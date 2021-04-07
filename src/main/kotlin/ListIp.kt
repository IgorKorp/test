import java.lang.Exception
import java.math.BigInteger
import java.util.*
import java.net.InetAddress

public class ListIp {
    private val maxLength  = 2147483647
    private val ipBitArrOne  = BitSet(maxLength)
    private val ipBitArrTwo  = BitSet(maxLength)

    private fun getIndex(str: String): Long? {
        return try {
            BigInteger(1, InetAddress.getByName(str).address).toLong()
        } catch (e: Exception) {
            null
        }
    }
    fun add(ip: String) {
        var index = getIndex(ip.replace(" ", ""))
        if (index != null) {
            when {
                index > maxLength  -> {
                    index = index - maxLength - 1
                    ipBitArrTwo[index.toInt()] = true
                }
                else ->  ipBitArrOne[index.toInt()] = true
            }
        }
    }

    fun total(): Long {
        return ipBitArrOne.stream().count() + ipBitArrTwo.stream().count()
    }
}