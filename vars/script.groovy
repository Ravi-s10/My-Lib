#!/usr/bin/env groovy

println "Hello , This is a groovy Script!"


def call() {


def result = "ls -ltr".excute()

println "Result of 'ls -ltr':"

println result.text
}
