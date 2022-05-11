/*  Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
    Note: Unlike 0/1 knapsack, you are allowed to break the item.
*/


    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here

        Arrays.sort(arr,(a,b)->{
           return -a.value*b.weight+a.weight*b.value;
        });
        int i =0;
        double result = 0;
        while(W!=0&&i!=n){
            if(W>=arr[i].weight){
                result += arr[i].value;
                W -= arr[i].weight;
                i++;
            }else{
                result += ((double)W/arr[i].weight)*arr[i].value;
                break;
            }
        }

        return result;
    }
