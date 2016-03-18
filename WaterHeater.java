import java.util.Date;

/**
 * Created by chitrakakkar on 3/17/16.
 */
public class WaterHeater extends ServiceCall
{

    protected Integer Age;
    protected static final Integer MandatoryFee = 20;
    public WaterHeater(String serviceAddress, String problemDescription, Date date,Integer age)
    {
        super(serviceAddress, problemDescription, date);
        this.Age = age;

    }
    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);

        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Age = " + Age + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Service Fee = " + feeString + " +the mandatory city fee " + MandatoryFee ;

    }

}
