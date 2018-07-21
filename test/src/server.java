import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.awt.event.KeyEvent;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String args[]) throws IOException, AWTException {
        String temp;
        int checker = 343;
        Robot robot = new Robot();
              try {
                  ServerSocket ss = new ServerSocket(7000);
                  while (true) {
                      checker = 343;
                      Socket s2 = ss.accept();
                      Scanner scan = new Scanner(s2.getInputStream());
                      temp = scan.nextLine();
                      if(temp.length() == 1)
                          temp = temp.toUpperCase();

                      if (temp.equals("notepad") == true)
                          checker = 555;
                      else if (temp.equals("chrome") == true)
                          checker = 777;
                      else if (temp.equals("vlc") == true)
                          checker = 999;
                      else if (temp.equals("shutdown") == true)
                          checker = 111;
                      else if (temp.equals("restart") == true)
                          checker = 333;
                      else if (temp.equals("gedit") == true)
                          checker = 222;
                      else if (temp.equals("mozila_firefox") == true)
                          checker = 666;
                      else if (temp.equals("restart_ubu") == true)
                          checker = 888;
                      else if (temp.equals("poweroff") == true)
                          checker = 0;
                      else if (temp.equals("vlc_ubu") == true)
                          checker = 1234;
                      else if (temp.equals("forward") == true)
                          checker = 786;
                      else if (temp.equals("backward") == true)
                          checker = 780;



                      if (checker == 555)
                          Runtime.getRuntime().exec("notepad.exe");
                      else if (checker == 777)
                          Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                      else if (checker == 999)
                          Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
                      else if (checker == 111)
                          Runtime.getRuntime().exec("shutdown /s");
                      else if (checker == 333)
                          Runtime.getRuntime().exec("shutdown /r");
                      else if (checker == 0)
                          Runtime.getRuntime().exec("poweroff");
                      else if (checker == 1234)
                          Runtime.getRuntime().exec("vlc");
                      else if (checker == 222)
                          Runtime.getRuntime().exec("gedit");
                      else if (checker == 666)
                          Runtime.getRuntime().exec("firefox");
                      else if (checker == 888)
                          Runtime.getRuntime().exec("restart");
                      else if (checker == 786)
                          robot.keyPress(KeyEvent.VK_RIGHT);
                      else if (checker == 780)
                          robot.keyPress(KeyEvent.VK_LEFT);
                      System.out.println(temp);

                      if (temp.equals("A") == true ){
                          robot.keyPress(KeyEvent.VK_A);
                      }
                      else if(temp.equals("B") == true){
                          robot.keyPress(KeyEvent.VK_B);
                      }
                      else if(temp.equals("C") == true){
                          robot.keyPress(KeyEvent.VK_C);
                      }
                      else if(temp.equals("D") == true){
                          robot.keyPress(KeyEvent.VK_D);
                      }
                      else if(temp.equals("E") == true){
                          robot.keyPress(KeyEvent.VK_E);
                      }
                      else if(temp.equals("F") == true){
                          robot.keyPress(KeyEvent.VK_F);
                      }
                      else if(temp.equals("G") == true){
                          robot.keyPress(KeyEvent.VK_G);
                      }
                      else if(temp.equals("H") == true){
                          robot.keyPress(KeyEvent.VK_H);
                      }
                      else if(temp.equals("I") == true){
                          robot.keyPress(KeyEvent.VK_I);
                      }
                      else if(temp.equals("J") == true){
                          robot.keyPress(KeyEvent.VK_J);
                      }
                      else if(temp.equals("K") == true){
                          robot.keyPress(KeyEvent.VK_K);
                      }
                      else if(temp.equals("L") == true){
                          robot.keyPress(KeyEvent.VK_L);
                      }
                      else if(temp.equals("M") == true){
                          robot.keyPress(KeyEvent.VK_M);
                      }else if(temp.equals("N") == true){
                          robot.keyPress(KeyEvent.VK_N);
                      }else if(temp.equals("O") == true){
                          robot.keyPress(KeyEvent.VK_O);
                      }else if(temp.equals("P") == true){
                          robot.keyPress(KeyEvent.VK_P);
                      }
                      else if(temp.equals("Q") == true){
                          robot.keyPress(KeyEvent.VK_Q);
                      }
                      else if(temp.equals("R") == true){
                          robot.keyPress(KeyEvent.VK_R);
                      }
                      else if(temp.equals("S") == true){
                          robot.keyPress(KeyEvent.VK_S);
                      }
                      else if(temp.equals("T") == true){
                          robot.keyPress(KeyEvent.VK_T);
                      }
                      else if(temp.equals("U") == true){
                          robot.keyPress(KeyEvent.VK_U);
                      }
                      else if(temp.equals("V") == true){
                          robot.keyPress(KeyEvent.VK_V);
                      }
                      else if(temp.equals("W") == true){
                          robot.keyPress(KeyEvent.VK_W);
                      }
                      else if(temp.equals("X") == true){
                          robot.keyPress(KeyEvent.VK_X);
                      }
                      else if(temp.equals("Y") == true){
                          robot.keyPress(KeyEvent.VK_Y);
                      }
                      else if(temp.equals("Z") == true){
                          robot.keyPress(KeyEvent.VK_Z);
                      }
                      else if(temp.equals(";") == true){
                          robot.keyPress(KeyEvent.VK_SEMICOLON);
                      }
                      else if(temp.equals("1") == true){
                          robot.keyPress(KeyEvent.VK_1);
                      }
                      else if(temp.equals("2") == true){
                          robot.keyPress(KeyEvent.VK_2);
                      }
                      else if(temp.equals("3") == true){
                          robot.keyPress(KeyEvent.VK_3);
                      }
                      else if(temp.equals("4") == true){
                          robot.keyPress(KeyEvent.VK_4);
                      }
                      else if(temp.equals("5") == true){
                          robot.keyPress(KeyEvent.VK_5);
                      }
                      else if(temp.equals("6") == true){
                          robot.keyPress(KeyEvent.VK_6);
                      }
                      else if(temp.equals("7") == true){
                          robot.keyPress(KeyEvent.VK_7);
                      }
                      else if(temp.equals("8") == true){
                          robot.keyPress(KeyEvent.VK_8);
                      }
                      else if(temp.equals("9") == true){
                          robot.keyPress(KeyEvent.VK_9);
                      }
                      else if(temp.equals("0") == true){
                          robot.keyPress(KeyEvent.VK_0);
                      }
                      else if(temp.equals(" ") == true){
                          robot.keyPress(KeyEvent.VK_SPACE);
                      }
                      else if(temp.equals("\n") == true){
                          robot.keyPress(KeyEvent.VK_ENTER);
                      }
                      else if(temp.equals("\b") == true){
                          robot.keyPress(KeyEvent.VK_BACK_SPACE);
                      }





                  }

              }
        catch (IOException e){
                  e.printStackTrace();
        }
    }

}
