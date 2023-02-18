package application;

public class boxMovement {

        public static void main(String[] args) {
            double mass = 3; // in kg
            double force = 20; // in N
            double angle = 40; // in degrees
            double mu_static = 0.7;
            double mu_kinetic = 0.35;
            double g = 9.8; // acceleration due to gravity in m/s^2

            double f_friction_static = mu_static * (mass * g);
            double f_friction_kinetic = mu_kinetic * (mass * g);
            double f_pull = force * Math.cos(Math.toRadians(angle));

            if (f_pull > f_friction_static) {
                System.out.println("The box moves.");
            } else if (f_pull >= f_friction_kinetic) {
                System.out.println("The box is on the verge of moving.");
            } else {
                System.out.println("The box does not move.");
            }
            System.out.println(f_pull);
        }
}
