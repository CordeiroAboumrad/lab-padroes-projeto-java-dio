package one.digitalinnovation.gof.facade;

public class TestFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Jean Pierre", "12345678");
    }
}
