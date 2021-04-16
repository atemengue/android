package com.rsk

fun main() {
    val meeting = Meeting("React Metting")

    println("Created: $meeting as name ${meeting.meetingName} ")
    val name = Name()
    name.name = "Regis"

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