public class Wind {
//    Elements a = Elements.wind;
    String name = Elements.wind.getTranslationt();
    public String toString() {
        return ("Привет я" + name);
    }
    public void permeate() {
        System.out.print("чтобы туда проникал " + name);
    }
}
