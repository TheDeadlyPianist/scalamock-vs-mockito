package utils

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.wordspec.AnyWordSpec
import org.specs2.matcher.ShouldMatchers

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Awaitable}

trait UnitTests extends AnyWordSpec with ShouldMatchers with ScalaFutures {
  def await[T](awaitable: Awaitable[T], duration: Duration = Duration.Inf): T = Await.result(awaitable, duration)
}
