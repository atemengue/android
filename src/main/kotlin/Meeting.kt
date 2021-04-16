package  com.rsk

open class Meeting(val meetingName: String, val location: Location = Location("")) {

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

     protected open fun verifyMeeting() {

    }
 }

class PersonalReview(meetingName: String, employee: Participant, reviewers: List<Participant>, location: Location = Location(""))
    :Meeting(meetingName, location) {

        fun closeReview() {
            println("Review ended")
            verifyMeeting()
        }


        override  fun verifyMeeting() {
            println("PersonalReview: verify meeting")
            super.verifyMeeting()
        }
}


