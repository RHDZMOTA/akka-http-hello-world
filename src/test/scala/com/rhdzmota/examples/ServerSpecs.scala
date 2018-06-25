package com.rhdzmota.examples

import akka.http.scaladsl.testkit.ScalatestRouteTest
import com.rhdzmota.examples.model.{Greeting, Salutation}
import org.scalatest.{Matchers, WordSpec}

class ServerSpecs extends WordSpec with Matchers with ScalatestRouteTest {

  "The Service" should {

    "return a hello-world json (english) for GET request to /v1.0.0/hello" in {
      Get("/v1.0.0/hello") ~> Server.route ~> check {
        val jsonString = responseAs[String]
        val expectedResponse = Greeting.fromSalutation(Salutation.Hello)
        Greeting.fromJson(jsonString).foreach(_ shouldBe expectedResponse)
      }
    }

    "return a hello-world json (english) for GET request to /v1.0.0/hello/json" in {
      Get("/v1.0.0/hello/json") ~> Server.route ~> check {
        val jsonString = responseAs[String]
        val expectedResponse = Greeting.fromSalutation(Salutation.Hello)
        Greeting.fromJson(jsonString).foreach(_ shouldBe expectedResponse)
      }
    }

    "return a hello-world json (english) for GET request to /v1.0.0/hello/json/lang" in {
      Get("/v1.0.0/hello/json/lang") ~> Server.route ~> check {
        val jsonString = responseAs[String]
        val expectedResponse = Greeting.fromSalutation(Salutation.Hello)
        Greeting.fromJson(jsonString).foreach(_ shouldBe expectedResponse)
      }
    }

    "return a hello-world json (english) for GET request to /v1.0.0/hello/json/lang/en" in {
      Get("/v1.0.0/hello/json/lang/en") ~> Server.route ~> check {
        val jsonString = responseAs[String]
        val expectedResponse = Greeting.fromSalutation(Salutation.Hello)
        Greeting.fromJson(jsonString).foreach(_ shouldBe expectedResponse)
      }
    }

    "return a hello-world json (spanish) for GET request to /v1.0.0/hello/json/lang/es" in {
      Get("/v1.0.0/hello/json/lang/es") ~> Server.route ~> check {
        val jsonString = responseAs[String]
        val expectedResponse = Greeting.fromSalutation(Salutation.Hola)
        Greeting.fromJson(jsonString).foreach(_ shouldBe expectedResponse)
      }
    }

    "return a hello-world json (french) for GET request to /v1.0.0/hello/json/lang/fr" in {
      Get("/v1.0.0/hello/json/lang/fr") ~> Server.route ~> check {
        val jsonString = responseAs[String]
        val expectedResponse = Greeting.fromSalutation(Salutation.Bonjour)
        Greeting.fromJson(jsonString).foreach(_ shouldBe expectedResponse)
      }
    }
  }
}
