class Main{
    public static void main(String[] args) {
        int year=2008;

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("LEAP YEAR");
                }
                else{
                    System.out.println("NOT LEAP YEAR");
                }
            }
            else{
                System.out.println("LEAP YEAR");
            }
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}