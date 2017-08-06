package algorithms4th.insertion

import algorithms4th.sort.Base

class InsertionKt() : Base() {

    override fun sort(a: Array<Comparable<*>>) {
        val n = a.size
        for (i in 1..n - 1) {
            var j = i
            while (j > 0 && less(a[j], a[j - 1])) {
                exch(a, j, j - 1)
                j--
            }
        }

    }


}