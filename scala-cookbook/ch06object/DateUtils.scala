import java.text.SimpleDateFormat
import java.util.Calendar
object DateUtils {
    // as "Thursday, November 29"
    def getCurrentDate:String = getCurrentDateTime("EEEE, MMMM d")

    def getCurrentTime:String = getCurrentDateTime("K:m aa")

    private def getCurrentDateTime(dateTimeFormat:String):String = {
        val dateFmt = new SimpleDateFormat(dateTimeFormat)
        val cal = Calendar.getInstance()
        dateFmt.format(cal.getTime)
    }
}