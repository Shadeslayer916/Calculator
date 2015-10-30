public class Calculator : ICalculator
{

    double Calculate(double argument, NumericOperations operation)
    {
	Calculate(argument, null, operation); 
    }
    
    double Calculate(double firstArgument, double secondArgument, NumericOperations operation)
    {
	double result = 0;
	
	switch(operation) {
	case ADDITION:
	    result = Arithmetic.Addition(firstArgument, secondArgument);
	    break;
	case SUBTRACTION:

	    break;
	case MULTIPLICATION:

	    break;
	case DIVISION:

	    break;
	case MODULO:

	    break;
	case EXPONENTIATION:

	    break;
	case SINE:

	    break;
	case COSINE:

	    break;
	case TANGENT:

	    break;
	case COTANGENT:

	    break;
	case SECANT:

	    break;
	case COSECANT:

	    break;
	case LOG:

	    break;
	case LN:

	    break;
	case FACTORIAL:

	    break;
	default:
	    // ToDo
	    
	    break;
	}
	
	return result; 
    }
    
    String Format(double value, NumericFormat format)
    {
	
    }
    
    String ConvertToDegrees(double radianValue)
    {
	
    }

    
}
