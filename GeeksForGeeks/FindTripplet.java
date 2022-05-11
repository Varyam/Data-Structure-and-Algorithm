/*  Given an array arr of size n and an integer X.
    Find if there's a triplet in the array which sums up to the given integer X.
*/


    public static boolean find3Numbers(int A[], int n, int X) { 

        if(n<3)
        return false;

        Arrays.sort(A);
        for(int i=0;i<n-2;i++){
            if(getSum(A,X-A[i],i))
            return true;
        }

        return false;
    }

    public static boolean getSum(int[] A,int sum,int itr){
        int low = itr+1;
        int high = A.length-1;
        while(low!=high){
            if(sum==A[low]+A[high])
            return true;
            else if(sum<A[low]+A[high])
            high--;
            else
            low++;
        }

        return false;
    }
