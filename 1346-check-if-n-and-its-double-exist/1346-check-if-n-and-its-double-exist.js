/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    for(count=0;count<arr.length;count++)
    {
        for(j=0;j<arr.length;j++)
        {
            if(arr[count] === arr[j]*2 && count!=j)
            return true;
        }
    }
    return false;
};