class rightstar {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

