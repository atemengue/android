package com.rsk

fun main() {
    val meeting = Meeting("React Metting", UkAddress("a house", "a street", "a town", "a country", "post code") )

   /// val secondMeeting = Meeting("NodeJs Conf", Location("Any address"))

    val review = PersonalReview("Review meeting", Participant(Name("Tyra landry"), "landry@email.com"), listOf(),Room("Room 1"))

    // println("Created: $meeting with name ${meeting.meetingName} at ${meeting.location} ")
    println("Created: $review with name ${review.meetingName} at ${review.location} ")

    review.closeReview()

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