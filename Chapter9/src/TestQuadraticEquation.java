public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(1, 5, -6);
        System.out.println("Discriminant: " + qe.getDiscriminant());
        if (qe.getDiscriminant() == 0)
            System.out.println("R:" + qe.getRoot1());
        else {
            System.out.println("R1: " + qe.getRoot1() + ", R2: " + qe.getRoot2());
        }
    }
}
