public class mains {
    public static void main(String[] args) {
        int arr1[][]=new int[2][2];
        arr1[0][0]=10;
        arr1[0][1]=20;
        arr1[1][0]=30;
        arr1[1][1]=40;
        int arr2[][]=new int[2][2];
        arr2[0][0]=50;
        arr2[0][1]=60;
        arr2[1][0]=70;
        arr2[1][1]=80;
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(arr1[i][j] + arr2[i][j]);
            }
            System.out.println();
        }
    }
}


