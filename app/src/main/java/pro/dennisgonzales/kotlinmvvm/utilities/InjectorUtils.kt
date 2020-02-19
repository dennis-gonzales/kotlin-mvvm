package pro.dennisgonzales.kotlinmvvm.utilities

import pro.dennisgonzales.kotlinmvvm.data.FakeDatabase
import pro.dennisgonzales.kotlinmvvm.data.QuoteRepository
import pro.dennisgonzales.kotlinmvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}