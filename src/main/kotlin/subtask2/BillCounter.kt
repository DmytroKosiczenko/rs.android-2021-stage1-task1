package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val shouldPayAnna : Int = (bill.sum() - bill[k]) / 2

        if(b == shouldPayAnna) return "Bon Appetit"

        return (b - shouldPayAnna).toString()
    }
}
