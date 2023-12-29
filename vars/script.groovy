#!/usr/bin/env groovy

println "Hello , This is a groovy Script!"


def printGreeting(name) {
println "Greetings, $name"
}

printGreeting("Ravi")



def result = "ls -ltr".excute()

println "Result of 'ls -ltr':"

println result.text
