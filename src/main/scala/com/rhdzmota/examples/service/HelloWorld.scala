package com.rhdzmota.examples.service

import com.rhdzmota.examples.model.{Greeting, Salutation}

sealed trait HelloWorld {
  def getGreetings: Greeting
}

object HelloWorld {

  case object English extends HelloWorld {
    override val getGreetings: Greeting = Greeting.fromSalutation(Salutation.Hello)
  }

  case object Spanish extends HelloWorld {
    override val getGreetings: Greeting = Greeting.fromSalutation(Salutation.Hola)
  }

  case object French extends HelloWorld {
    override val getGreetings: Greeting = Greeting.fromSalutation(Salutation.Bonjour)
  }

}
