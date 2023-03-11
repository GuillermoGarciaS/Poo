package src.Reto5.ui;

import src.Reto5.process.*;

import src.Reto5.menu.*;


public class CLI {

      private static String modoFacil = "|Modo Facil|";
      private static String seleccionarModoFacil = "Facil";

      private static String modoIntermedio = "|Modo Intermedio|";
      private static String seleccionarModoIntermedio = "Intermedio";

      private static String modoDificil = "|Modo Dificil|";
      private static String seleccionarModoDificil = "Dificil";

      private static Menu menu = new Menu();


      private static MenuAction easyAction = (scanner) -> {
            System.out.println(modoFacil);
            String palabraFacil = "";
            palabraFacil = Juego.getModoFacil();
            System.out.println(palabraFacil);
            System.out.println();

      
      };

      private static MenuAction intermediumAction = (scanner) -> {
            System.out.println(modoIntermedio);
            String palabraIntermedia = "";
            palabraIntermedia = Juego.getModoIntermedio();
            System.out.println(palabraIntermedia);
            System.out.println();
      };

      private static MenuAction HardAction = (scanner) -> {
            System.out.println(modoDificil);
            String palabraDificil = "";
            palabraDificil = Juego.getModoDificil();
            System.out.println(palabraDificil);
            System.out.println();
      }; 

      static { 
            menu
            .agregarOpccion(seleccionarModoFacil, easyAction);

            menu
            .agregarOpccion(seleccionarModoIntermedio, intermediumAction);

            menu
            .agregarOpccion(seleccionarModoDificil, HardAction);

            menu
            .crearMenu();
      }

      public static void showJuego(){
      do {
            menu.showMenu();
            var option = menu.readOption();
            menu.seleccionarYCorrerOpcion(option);
      }while (menu.isAlive());
  }
}


