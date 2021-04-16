package  com.rsk

class Meeting(val meetingName: String, val location: Location = Location("")) {

    internal val logger = Logger()
    //var location:  Location = Location("")

    /*constructor(meetingName: String, location: Location):this(meetingName) {
        // reinistialser
       this.location = location
    } */

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


class Location(val address: String) {

}