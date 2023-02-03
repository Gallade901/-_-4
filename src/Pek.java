import java.util.Objects;

public class Pek extends Person implements ActionsPek {
    String name = "Пек";
    public String toString() {
        return ("Привет я " + name);
    }
    public void staredExclaimed() {
        if (name.equals("")) throw new NameException("У персонажа нету имени");
        System.out.print(name + " уставился в потолок и воскликнул:");}
    public void noTears() {System.out.println("На глазах у него не было слез.");}
    public void eat() {
        System.out.print(name + " отведает соус фрекен Бок. ");
    }
    public void sitEat() {
        System.out.print(name + " спокойно сидел и уплетал за двоих. ");
    }
    public void praised() {
        System.out.print(name + " расточал огненному блюду. ");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pek pek = (Pek) o;
        return name.equals(pek.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
