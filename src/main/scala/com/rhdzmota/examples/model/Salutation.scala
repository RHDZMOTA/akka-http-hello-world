package com.rhdzmota.examples.model

sealed trait Salutation {
  def toString: String
  def lang: Lang
}

object Salutation {

  case object Hello extends Salutation {
    val lang: Lang = Lang.En

    override def toString: String = "Hello World!"
  }

  case object Hola extends Salutation {
    val lang: Lang = Lang.Es

    override def toString: String = "¡Hola mundo!"
  }

  case object Bonjour extends Salutation {
    val lang: Lang = Lang.Fr

    override def toString: String = "Bonjour monde!"
  }

}
