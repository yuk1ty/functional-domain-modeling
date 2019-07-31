package com.github.yuk1ty.domain.model.account

import java.time.LocalDate

import com.github.yuk1ty.domain.model.balance.Balance

case class Account(no: String,
                   name: String,
                   dateOfOpening: LocalDate,
                   balance: Balance = Balance())
