package  com.rsk

class Meeting {
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