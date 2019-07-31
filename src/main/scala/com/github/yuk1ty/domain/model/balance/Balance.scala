package com.github.yuk1ty.domain.model.balance

import com.github.yuk1ty.domain.model.balance.Balance.Amount

case class Balance(amount: Amount = 0)

object Balance {
	type Amount = BigDecimal
}
