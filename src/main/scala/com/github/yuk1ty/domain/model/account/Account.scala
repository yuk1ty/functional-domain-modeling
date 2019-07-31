package com.github.yuk1ty.domain.model.account

import java.time.LocalDate

import com.github.yuk1ty.domain.model.balance.Balance
import com.github.yuk1ty.domain.model.balance.Balance.Amount

class Account(val no: String,
              val name: String,
              val dateOfOpening: LocalDate,
              val balance: Balance = Balance()) {
  def debit(a: Amount): Account =
    if (balance.amount < a)
      throw new Exception("Insufficient balance in account")
    else new Account(no, name, dateOfOpening, Balance(balance.amount - a))

  def credit(a: Amount) =
    new Account(no, name, dateOfOpening, Balance(balance.amount + a))
}
