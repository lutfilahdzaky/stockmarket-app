package com.plcoding.stockmarketapp.presentation.company_listings

sealed class CompanyListingsEvent {
    object Refresh: CompanyListingsEvent()
    data class OnSeacrhQueryChange(val query: String): CompanyListingsEvent()
}