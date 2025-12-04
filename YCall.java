public class YCall extends Call {

    private Calc calc = new Calc();

    public Double action(body Body){
        return calc.findY(Body);
    }

}
