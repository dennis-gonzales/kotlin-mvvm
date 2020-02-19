package pro.dennisgonzales.kotlinmvvm.data

data class Quote(val quoteText: String,
                 val authorText: String) {

    override fun toString(): String {
        return "$quoteText - $authorText"
    }

}