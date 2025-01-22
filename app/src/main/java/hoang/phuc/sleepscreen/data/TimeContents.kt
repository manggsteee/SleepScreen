package hoang.phuc.sleepscreen.data

import java.time.LocalTime

data class TimeContents(
    val startTime: LocalTime = LocalTime.of(8, 0),
    val endTime: LocalTime = LocalTime.of(9, 0),
    val repeatTime: String = "Tối T6 đến Tối T7"
)
