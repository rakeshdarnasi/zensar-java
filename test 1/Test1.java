import java.util.*;
public class Test1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.next();
  
        int len=0;
        ArrayList<String> Test1=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            len=arr[i].length();
            if(len%2==1)
            Test1.add(arr[i]);       
        }  
        if(Test1.size()==0) 
             System.out.println("Better luck next time");
        else 
        {
            Iterator itr=Test1.iterator();
            int max=-1;
            String res="";
            while(itr.hasNext())
            {
                String temp=(String)itr.next();
                if(temp.length()>max)
                {
                    res=temp;     
                    max=temp.length(); 
                }
             }
            System.out.println(res);
        }
    }
}
