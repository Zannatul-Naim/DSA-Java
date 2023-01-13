## What is Linear or Sequential Search? 

*Linear search* or *sequential search* is a method for finding a target value within a list. 

It sequentially checks each element fo the list for the target value untill a match is found or untill all the elements have been searched.

Linear search runs in at worst linear time and makes at most n comparisons, where n is the length fo the list.

## How does Linear Seaerch work ? 
<br>

![Linear](./linear_search.png)

<br>

## *Algorithm*
<hr>

<b> Linear Search(array a, value val) </b>

step 1: set i to 1 <br>
step 2: if i > n then go to step 7 <br>
step 3: if a[i] = val then goto step 6 <br>
step 4: set i to i+1 <br>
step 5: goto step 2 <br>
step 6: return index i <br>
step 7: return -1 <br>
step 8: exit <br>
<hr>

### Full implementation

```java

public class LinearSearch {
    
    public static int linear_search(int [] arr, int key) {

        int size = arr.length;
        for(int i = 0; i < size; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int [] inputArray = {24, 25, 65, 89, 90, 12, 1, 0, 30};
        int searchKey = 0;
        System.out.println("Key " + searchKey + " found at index: " + linear_search(inputArray, searchKey));
    }
}


```

