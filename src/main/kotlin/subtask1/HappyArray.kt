package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray) : IntArray{
        var  resultArray: MutableList<Int> = sadArray.toMutableList()
        var i = 1
        while (i < resultArray.size-1)  {
            if(resultArray.size <= 2) break

            if (resultArray[i] > resultArray[i-1] + resultArray[i+1]) {
                resultArray.removeAt(i)
                i--
            } else {
                i++;
            }

            if(i < 1) i = 1
        }
        return resultArray.toIntArray();
    }
}
