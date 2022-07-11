package lesson12;

public class Main {
    public static void main(String[] args) {
        double [][] nums1 = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}};
        double [][] nums2 = {{4,4,4,4}, {5,5,5,5}, {6,6,6,6}};

        Matrix a = new Matrix(nums1);
        Matrix b = new Matrix(nums2);

        // a (неявный параметр) ---- внутри метода this
        // b (явный параметр) ---- внутри метода otherMatrix
        IMatrix result = a.add(b);
        result.printToConsole();
    }
}
