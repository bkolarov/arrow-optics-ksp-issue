package com.exampleapp.testksp

import arrow.optics.optics

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

@optics
sealed interface CommonSealed {

    companion object

    @optics
    data class A(val value: String) : CommonSealed {
        companion object
    }

    @optics
    data class B(val number: Int) : CommonSealed {
        companion object
    }

}

fun foo() {

}
