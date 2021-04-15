package  com.rsk

class Meeting {

    internal val logger = Logger()

    fun addPraticipant(name: String) {
        if(verifyParticipant(name))
            println("Added $name")
    }

    private fun verifyParticipant(name: String): Boolean {
        println("Try to verify")
        return  true
    }

    protected fun verifyMeeting() {

    }
 }