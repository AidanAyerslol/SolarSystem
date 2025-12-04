public class XCall extends Call{

    private Calc calc = new Calc();

    public Double action(body Body){
        return calc.findX(Body);
    }

}
