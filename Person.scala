package edu.knoldus

import org.apache.log4j.Logger

import scala.util.Random

abstract class Person

case class dicePlayer (countTimes: Int) extends Person

case class Attendance (response: String, classStrength: Int) extends Person

class SituationOfPerson {

  def diceGamer (dice: Int, noOfTimes: Int): String = {

    dice match {
      case scenario if (dice < -1) => "Invalid roll of Dice"
      case scenario if (dice < 3) => {
        val increment = 1
        dice match {

          case 1 => diceGamer (dice, noOfTimes + increment)
          case 6 => diceGamer (dice, noOfTimes + increment)
          case _ => Nil

            val terms = noOfTimes

            terms match {
              case 3 => "Winner"
              case _ => "Looser"
            }
        }
      }
    }
  }
}

object TypeOfPerson {
  def main (args: Array[String]) {

    val log = Logger.getLogger (getClass)
    val randomNumber = scala.util.Random
    val limit = 6
    for (i <- 0 to 2) {
      log.info(randomNumber.nextInt (limit))
    }
    val personObj = new SituationOfPerson
    val countNoOfTurns = 2
    log.info(personObj.diceGamer (randomNumber.nextInt (limit), countNoOfTurns))

    val random1 = new Random
    val totalStrength = 50
    val PresentCandidate = Attendance ("Trainee Response", random1.nextInt (totalStrength))
    log.info(PresentCandidate)
  }
}

