public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon regular1 = new RegularPolygon();
        RegularPolygon regular2 = new RegularPolygon(6, 4);
        RegularPolygon regular3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Regular Polygon 1 alanı: " + regular1.getArea() + " ve çevresi: " + regular1.getPerimeter());
        System.out.println("Regular Polygon 2 alanı: " + regular2.getArea() + " ve çevresi: " + regular2.getPerimeter());
        System.out.println("Regular Polygon 3 alanı: " + regular3.getArea() + " ve çevresi: " + regular3.getPerimeter());
    }
}
