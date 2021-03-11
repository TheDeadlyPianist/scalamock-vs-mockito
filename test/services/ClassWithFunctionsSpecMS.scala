package services

import org.mockito.Mockito.when
import org.specs2.mock.mockito.MockitoStubs._
import utils.MockitoSugarUnitTests

class ClassWithFunctionsSpecMS extends MockitoSugarUnitTests {

  val customerService: CustomerDetailsService = mock[CustomerDetailsService]
  val customerController: CustomerDataController = new CustomerDataController(customerService)

  "get customer name" must {

    "return the customers name" in {

      when(customerService.getCustomerName("1234-5678-9000"))
        .thenReturn("Duane")

//
//      when(customerService.getCustomerName("1234-5678-9000"))
//        .thenReturn("Duane")
//
//      lazy val result = customerController.getCustomerName("1234-5678-9000")
//
//      result mustBe "Duane"
    }

  }

}
