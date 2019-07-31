package com.github.yuk1ty.domain.service.account

import com.github.yuk1ty.domain.model.account.Account
import com.github.yuk1ty.domain.model.balance.Balance
import com.github.yuk1ty.domain.model.balance.Balance.Amount

import scala.util.{Failure, Success, Try}

trait AccountService {

  def debit(account: Account, amount: Amount): Try[Account] =
    if (account.balance.amount < amount)
      Failure(new Exception("Insufficient balance in account"))
    else
      Success(account.copy(balance = Balance(account.balance.amount - amount)))

  def credit(account: Account, amount: Amount): Try[Account] =
    Success(account.copy(balance = Balance(account.balance.amount + amount)))
}

object AccountService extends AccountService
