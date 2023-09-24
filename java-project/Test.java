class Test {

    public static void printSystemproperties() {
        System.out.println("Printing system properties using");
        System.out.println(System.getProperties());
    }

    public static void main(String[] args) {
        System.out.println("Java program started........");
        printSystemproperties();
    }
}