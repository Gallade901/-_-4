import java.util.Objects;

public class Kid extends Person implements ActionsKid {
    private String watch = "и поглядел на ";
    String name = "Малыш ";
    public String toString() {
        return ("Привет я " + name);
    }
    public void watch() throws NameException {
        if (name.equals("")) throw new NameException("У персонажа нету имени");
        System.out.print(name + "хотел посмотреть, какой будет вид у господина Пека когда ");
    }
    public void openbox() {
        System.out.print(name + "приоткрыл ящик ");
    }

    public void watchOnPersonage(String personage) throws NoMessageException {
        if (watch == null) throw new  NoMessageException("У персонажа отсутствует фраза");
        System.out.print(watch + personage);
    }
    public void runKitchen() {
        System.out.print(" и помчался на кухню. ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kid kid = (Kid) o;
        return name.equals(kid.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
