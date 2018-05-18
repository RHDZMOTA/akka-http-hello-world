package com.rhdzmota.examples.service

import com.rhdzmota.examples.model.{Bonjour, Greeting, Hello, Hola}

sealed trait HelloWorld {
  def getGreetings: Greeting
}

case object English extends HelloWorld {
  override val getGreetings: Greeting = Greeting.fromSalutation(Hello)
}

case object Spanish extends HelloWorld {
  override val getGreetings: Greeting = Greeting.fromSalutation(Hola)
}

case object French extends HelloWorld {
  override val getGreetings: Greeting = Greeting.fromSalutation(Bonjour)
}
