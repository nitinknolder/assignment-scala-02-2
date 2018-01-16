package edu.knoldus

import org.apache.log4j.Logger

class CashPayments {

  def payMethods (amount: Float, paymentMode: String): Double = {

    paymentMode match {

      case "Paytm" => amount + (0.02 * amount)
      case "FreeRecharge" => amount + (0.02 * amount)
      case "NetBanking" => amount + 5
      case "CardPayment" => amount + 1.5
      case "CashPayment" => amount
      case _ => amount
    }
  }
}

object TiffinService {

  val log = Logger.getLogger (getClass)
  val amount: Float = 50

  def main (args: Array[String]) {
    val pay = new CashPayments
    if (amount > 0) {
      log.info (pay.payMethods (amount, "CardPayment"))
    }
    else {
      log.info ("Enter a Valid Amount!!!!")
    }
  }
}


