
package sort.elements.by.frequency;


public class SortElementsByFrequency {

    static int x=0;
    public static void main(String[] args) {
        int a[]={4,3,1,6,4,3,6,4};
        int b[][]=new int[a.length][2];
        
        a=sort(a);
//        for(int i:a)
//        {
//            System.out.print(i+",");
//        }

        b[x][0]=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]==a[i])
            {
               b[x][1]=b[x][1]+1; 
            }
            else
            {
                x++;
                b[x][0]=a[i];
                
            }
        }
        x++;
        b=sort(b);
        for(int i=0;i<x;i++)
        {
           for(int j=0;j<=b[i][1];j++)
           {
             System.out.print(" "+b[i][0]);  
           }
        }
        //System.out.println("");
    }
    
    public static int[][] sort(int b[][]){
       int c[]=new int[2];
        
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(b[i][1]<b[j][1])
                {    
                  c=b[i];
                  b[i]=b[j];
                  b[j]=c;
                }
            }
        }
        
        return b;
    }
    
    public static int[] sort(int a[]){
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
              if(a[i]>a[j])
              {
                  int t=a[i];
                  a[i]=a[j];
                  a[j]=t;
              }
            }
        }
        return a;
    }
    
}
