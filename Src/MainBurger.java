public class MainBurger {
    public static void main(String[] args) {
        Burger burger = new Burger ("Булочка", "Мясо", "Сыр", "Зелень", "Майонез");
        System.out.println ("Обычный бургер : " + burger);
        Burger burger1 = new Burger ("Булочка", "Мясо", "Сыр", "Зелень", "Без майонеза");
        System.out.println("Диетический бургер : " + burger1);
        Burger burger2 = new Burger ("Булочка", "Мясо(двойная порция)", "Сыр", "Зелень", "Майонез");
        System.out.println("Бургер с двойным мясом : " + burger2);
    }
}