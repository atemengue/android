package com.rsk

fun main() {
    val meeting = Meeting("React Metting")

   /// val secondMeeting = Meeting("NodeJs Conf", Location("Any address"))

    println("Created: $meeting with name ${meeting.meetingName} at ${meeting.location} ")
    val name = Name("Regis Atemengue")
    //name.name = "Regis"

    val participant = Participant(name, "moafembe@gmail.com")

    //participant.name = name
    //participant.email = "moafembe@gmail.com"

    val canonicalEmail: String = participant.canonicalEmail

    meeting.addPraticipant(participant)
    //println(participant.participantName)

    //println(canonicalEmail)
    //meeting.meetingName = "Review"
    //meeting.logger()

}