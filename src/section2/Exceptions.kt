package section2

import testing.capture

fun main() {
    capture {
        "abc".toDouble()
    } eq "NumberFormatException: For input string: \"abc\""
}