package  com.rsk

class Meeting(val meetingName: String) {

    internal val logger = Logger()
    fun addPraticipant(participant: Participant) {
        if(verifyParticipant(participant))
            println("Added ${participant.name}")
    }

    private fun verifyParticipant(participant: Participant): Boolean {
        println("Try to verify")
        return  true
    }

    protected fun verifyMeeting() {

    }
 }

class Participant(val name:Name, val email: String) {
    //var name: Name = Name()
    //var email = ""

    val participantName
      get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()
}

class Name {
    var name: String = ""
    set(value: String) {
        if (value.isNullOrBlank()) throw IllegalArgumentException()
        field = value
    }
}