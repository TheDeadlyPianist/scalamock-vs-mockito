package services

import scala.concurrent.{ExecutionContext, Future}

trait CustomerDetailsService {
  def getCustomerName(id: String): String

  def getCustomerAge(id: String): Int

  def getAllCustomerIds: Seq[String]

  def updateUser(id: String, name: Option[String], age: Option[Int])(implicit ec: ExecutionContext): Future[Int]
}
