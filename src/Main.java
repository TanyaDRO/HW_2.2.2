public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 87;
        int height = 181;
        int bmi = service.calculate(weight,height);
        System.out.println(bmi);
    }
}
