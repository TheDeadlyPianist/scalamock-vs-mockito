package utils

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Awaitable}

trait UnitTests extends AnyWordSpec with Matchers with ScalaFutures {
  def await[T](awaitable: Awaitable[T], duration: Duration = Duration.Inf): T = Await.result(awaitable, duration)
}
