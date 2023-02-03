public class Story {
    public static void main(String[] args) throws NoMessageException {
        Kid kid = new Kid();
        Bok.Sauce sauce = new Bok.Sauce();
        Wind wind = new Wind();
        Pek pek = new Pek();
        Bok bok = new Bok();
        Rumble karlson = new Rumble() {
            @Override
            public void rumble() {
                System.out.print(" который негромко урчал. ");
            }
        };
        kid.openbox();
        kid.watchOnPersonage("Карлсона");
        karlson.rumble();
        kid.openbox();
        wind.permeate();
        kid.runKitchen();
        kid.watch();
        pek.eat();
        pek.sitEat();
        pek.noTears();
        bok.flowing();
        bok.cry();
        pek.praised();
        bok.feel();
        pek.staredExclaimed();
        System.out.println();
        System.out.println("Конец истории...");
    }
}