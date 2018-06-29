package com.rhdzmota.examples

import akka.actor.ActorSystem
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.rhdzmota.examples.controller.HelloWorld

import scala.concurrent.ExecutionContext

object Server {

  val route: Route = 
    HelloWorld.route ~
    pathPrefix(API.currentVersion) {
      HelloWorld.route
    }

  def main(args: Array[String]): Unit = {
    implicit val actorSystem: ActorSystem = ActorSystem()
    implicit val executionContext: ExecutionContext = actorSystem.dispatcher
    implicit val actorMaterializer: ActorMaterializer = ActorMaterializer()
    Http().bindAndHandle(route, Settings.Http.host, Settings.Http.port)
  }
}
