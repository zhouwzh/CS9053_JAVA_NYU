package problem1;


public class Main {
    public static void main(String[] args) {
        // Test the no-argument constructor
        EllipticalTorus torus1 = new EllipticalTorus();
        torus1.setMajorRadius(5.0);
        torus1.setSemiMajorAvis(3.0);
        torus1.setSemiMinorAxis(2.0);

        System.out.println("Torus 1 ID: " + torus1.getId());
        System.out.println("Torus 1 Volume: " + torus1.getVolume());
        System.out.println("Torus 1 Surface Area: " + torus1.getSurfaceArea());

        // Test the parameterized constructor
        EllipticalTorus torus2 = new EllipticalTorus(7.0, 4.0, 3.0);
        System.out.println("Torus 2 ID: " + torus2.getId());
        System.out.println("Torus 2 Volume: " + torus2.getVolume());
        System.out.println("Torus 2 Surface Area: " + torus2.getSurfaceArea());
    }
}