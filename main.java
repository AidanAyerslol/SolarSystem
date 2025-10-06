public class main {
    public static void main(String[] args){

        // units: 1.0 per 100,000 km
        // orbital velocity is the time for a body to complete an orbit of its center
        body Sun = new body();
        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 6.9634);
        body Earth = new body();
        Earth.createBody("Earth", Sun, 0.0, 1490.0, 365.0, 0.06378);
        body Moon = new body();
        Moon.createBody("Moon", Earth, 0.0, 3.844, 27.3, 0.0174);
        Calc calc = new Calc();

        for (int i = 0; i<365; i++){
            Earth.updateAngle();
            Moon.updateAngle();
            calc.findDistance(Earth);
            calc.findDistance(Moon);
            calc.findX(Earth);
            calc.findY(Earth);
            calc.findX(Moon);
            calc.findY(Moon);
        }

    }
}
