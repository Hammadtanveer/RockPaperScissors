package com.example.rockpaperscissors

fun main(){
    var ComputerChoice=""
    var playerChoice =""
    println("Enter Rock,Paper or Scissors ? Enter your Choice")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            ComputerChoice="Rock"
        }
        2 -> {
            ComputerChoice="Paper"
        }
        3 -> {
            ComputerChoice="Scissors"
        }
    }
    println(ComputerChoice)

    val winner= when {
        playerChoice==ComputerChoice -> "tie"
        playerChoice=="Rock" && ComputerChoice == "Scissors" -> "Player"
        playerChoice=="Paper" && ComputerChoice == "Rock" -> "Player"
        playerChoice=="Scissors" && ComputerChoice == "Paper" -> "Player"
        else ->"Computer"

    }
    if (winner=="tie"){
        println("Its a ties")
    }
    else{
        println("$winner won!")
    }


}