class Solution {
    public int reverse(int x) {

       boolean neg = false;      //check if negative number
        if(x<0)
        {
            neg = true;
            x = x*-1;
        }
        
        //Convert to string than reverse by Array
        String y = Integer.toString(x);
        
        StringBuilder sb=new StringBuilder(y);  
        y = sb.reverse().toString();  
        
        // In case if its not a valid number it will return z0
        try {
            x = Integer.parseInt(y);
        } catch (NumberFormatException e) {
            return 0;
        }
        // below  will return the negative value to true if we have set 
        // x < 0 
        
        if(neg)
        {
            x*=-1;
        }
        return x;
    }
}
