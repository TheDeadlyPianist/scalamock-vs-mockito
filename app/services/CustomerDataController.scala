package services

import models.CustomerModel

import javax.inject.Inject

class CustomerDataController @Inject()(customerService: CustomerDetailsService) {

  def getCustomerName(id: String): String = customerService.getCustomerName(id)

  def getCustomerAge(id: String): Int = customerService.getCustomerAge(id)

  def getCustomerDetails(id: String): CustomerModel = {
    CustomerModel(
      customerService.getCustomerName(id),
      customerService.getCustomerAge(id)
    )
  }

}
