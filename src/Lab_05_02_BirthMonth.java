public class Lab_05_02_BirthMonth {
    public Lab_05_02_BirthMonth() {
    }
    public static void main(String[] args) {
        System.out.println("Enter your Birthday");
        int birthMonth = 13;
        if (birthMonth > 12){
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }else if (birthMonth < 1) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }else if (birthMonth >= 1)
            System.out.println("Your birth month is: " + birthMonth);
        }

}
