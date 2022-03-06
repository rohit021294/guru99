package javaaaa;

public class ArrayFirstHalfascendinLAstHalfDesecending {
    public static void main(String[] args)
    {
        int[] arr=new int[]{13,12,11,16,15,14};
        int temp=0;
        int size=arr.length/2;
        for(int i=0;i<size;i++)
            {
                for(int j=i+1;j<size;j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        for(int i=size;i>size/2;i--)
        {
            for(int j=i-1;j>size/2;j--)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }


    }
}
