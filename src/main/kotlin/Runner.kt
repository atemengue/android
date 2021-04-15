package com.rsk

fun main() {
    val meeting = Meeting()

    println("Created: $meeting")
    val participant = Participant()
    val name = Name()
    name.name = "Regis"
    participant.name = name
    participant.email = "moafembe@gmail.com"

    val canonicalEmail: String = participant.canonicalEmail

    meeting.addPraticipant(participant)
    println(participant.participantName)

    //println(canonicalEmail)
    //meeting.meetingName = "Review"
    //meeting.logger()

}