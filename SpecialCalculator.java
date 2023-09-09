public abstract class SpecialCalculator extends Calculator<Object> implements IspecialCalculator{
    @Override
    public Object divide(Object a, Object b) {
        throw new ArithmeticException("Divide operation is not available in this type of calculator");
    }

    public abstract double trig(double a, double b);
}
