package com.sheoanna;

public final class App {
    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the DNI Calculator!");
        System.out.println("------------------------------");

        DNIView view = new DNIView();
        DNIModel model = new DNIModel(0);
        DniController controller = new DniController(model, view);

        controller.start();
    }
}
