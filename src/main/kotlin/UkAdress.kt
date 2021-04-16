package com.rsk


abstract class  Post


class UkAddress(val firstLine:String,
                val secondLine:String,
                val city: String,
                val county:String,
                val postCode: String): Location()