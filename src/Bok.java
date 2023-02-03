import java.util.Objects;

public class Bok extends Person implements ActionsBok {
    String name = "Бок";
    public String toString() {
        return ("Привет я " + name);
    }
    public void flowing() {
        if (name.equals("")) throw new NameException("У персонажа нету имени");
        System.out.print("Зато у " + name + " слезы катились градом. ");
    }
    public static class Sauce {
        public void cook() {
            System.out.println("Соус готов");
        }//Рецепт для соуса (так мейби лучше)
    }
    public void cry() {
        System.out.print(name + " оплакивала провал. ");
    }
    public void feel() {
        System.out.print(name + " чувствовала себя бесконечно несчастной. ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bok bok = (Bok) o;
        return name.equals(bok.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
