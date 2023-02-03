public abstract class Person {
    private class GetDressed {
        public void getShoes() {
            System.out.println("Я надел обувь");
        }
        public void getJacket () {
            System.out.println("Я надел куртку");
        }
    }

    public void walk() {
        GetDressed dress = new GetDressed();
        dress.getShoes();
        dress.getJacket();
        System.out.println("Я пошел гулять");
    }
}
