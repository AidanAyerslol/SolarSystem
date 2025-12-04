public class UpdateCall extends Call{

    public Double action(body Body){
        Body.updateAngle();
        return 0.0;
    }

}
