package pro.dennisgonzales.kotlinmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import pro.dennisgonzales.kotlinmvvm.data.Quote
import pro.dennisgonzales.kotlinmvvm.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuote()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}