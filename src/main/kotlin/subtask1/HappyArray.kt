package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray) : IntArray{
        var sadArraySize = sadArray.size
        if ( sadArraySize <= 2)
            return sadArray

        var  happyArray: MutableList<Int> = mutableListOf<Int>()

        happyArray.add(sadArray[0])

        var i = 1
        while (i < sadArraySize-1)  {
            if (sadArray[i-1] + sadArray[i+1] >= sadArray[i]) {
                happyArray.add(sadArray[i])
            }
            i++;
        }
        happyArray.add(sadArray[i])

        if (!isHappy(happyArray.toIntArray())) {
           convertToHappy(happyArray.toIntArray())
        }
        return happyArray.toIntArray();
    }

    fun isHappy(checkArray: IntArray) : Boolean {
        var i = 1
        while (i < checkArray.size-1)  {
            if (checkArray[i-1] + checkArray[i+1] < checkArray[i]) {
                return false
            }
            i++;
        }
        return true;
    }
}
