/**
 * Created by Justin Rouse on 10/27/2015.
 * Note:  All calculations are done in radians.
 */
public interface ICalculator {
    double Calculate(double argument, NumericOperations operation);
    double Calculate(double firstArgument, double secondArgument, NumericOperations operation);
    String Format(double value, NumericFormat format);
    String ConvertToDegrees(double radianValue);
}
