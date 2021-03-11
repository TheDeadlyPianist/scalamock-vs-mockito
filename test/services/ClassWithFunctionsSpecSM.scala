package services

import utils.ScalaMockUnitTests

class ClassWithFunctionsSpecSM extends ScalaMockUnitTests{
  val customerService: CustomerDetailsService = mock[CustomerDetailsService]
  val customerController: CustomerDataController = new CustomerDataController(customerService)

  "get customer name" should {

    "return the customers name" in {

      (customerService.getCustomerName(_: String))
        .expects("1234-5678-9000")
        .returns("Duane")

      val result = customerController.getCustomerName("1234-5678-9000")

      result shouldEqual "Duane"
    }

  }

}
