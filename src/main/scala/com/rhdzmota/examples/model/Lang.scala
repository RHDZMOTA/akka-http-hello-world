package com.rhdzmota.examples.model

sealed trait Lang {
  override def toString: String
}

object Lang {

  case object En extends Lang {
    override def toString: String = "English"
  }

  case object Es extends Lang {
    override def toString: String = "Español"
  }

  case object Fr extends Lang {
    override def toString: String = "Francais"
  }
}
