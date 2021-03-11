package services

import org.mockito.Mockito.when
import utils.MockitoSugarUnitTests

class MockitoSugarTest extends MockitoSugarUnitTests {

  val customerService: CustomerDetailsService = mock[CustomerDetailsService]
  val customerController: CustomerDataController = new CustomerDataController(customerService)

  "get customer name" must {

    "return the customers name" in {

      when(customerService.getCustomerName("1234-5678-9000"))
        .thenReturn("Duane")

      //      when(customerService.getCustomerName("1234-5678-9000"))
      //        .thenReturn("Duane")

      lazy val result = customerController.getCustomerName("1234-5678-9000")

      result shouldBe "Duane"
    }

  }

}
