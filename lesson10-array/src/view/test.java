package view;

public class test {
    public static void main(String[] args) {
        int n = 11;
        int k = 1;

        for (int i = 1; i < n; i++) {
            if(i%2!=0) {
                k++;
                System.out.println(i*Math.pow(-1,k));
            }
        }
    }
}
