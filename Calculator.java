public class Calculator
{
    double[] result= new double[4];
 
    public double performAdditionOperation(int[] numbers)
    {
        result[0] = numbers[0]+numbers[1]; //adding 2 elements of number array
        return result[0];
    }
    public double performSubstractionOperation(int[] numbers)
    {
        result[1]= numbers[0]-numbers[1];//subtracting 2 elements of number array
        return result[1];
        
    }
    public double performDivisionOperation(int[] numbers)
    {
        result[2]=numbers[0]/numbers[1];//dividing 2 elements of number array
        return result[2];
    }
    public double performMultiplicationOperation(int[] numbers)
    {
        result[3]=numbers[0]*numbers[1];//multiplying 2 elements of number array
        return result[3];
    } 
    public double[] performArrayOperation(int[] multiplenumbers)
    {
        double[] result=new double[4];
        double sum=0;
        double std=0.0;
        double summ=0.0;
        for(int i=0;i<multiplenumbers.length;i++)
        {
            //adding all elements of number array
            sum+=multiplenumbers[i];
        }
        result[0]=sum;
        //calculating standard deviation
        double mean=sum/multiplenumbers.length;
        for(int i=0;i<multiplenumbers.length;i++)
        {
            summ=summ+Math.pow((multiplenumbers[i]-mean),2);
            std=Math.sqrt(summ/multiplenumbers.length);
            
        }
        result[1]=std;
        //calculating variance
        double variance = Math.pow(std,2);
        result[2]=variance;
        return result;
        
       
    }
}