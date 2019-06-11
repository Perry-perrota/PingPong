

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;


public class App {
    public static void main(String[]args){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Im a PingPong Application");
        System.out.println("Enter a number:");
        try {

            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingpong = new PingPong();
            ArrayList<Object> pingPongResult = pingpong.runPingPong(intUserNumber);
            System.out.println(pingPongResult);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        }



    }

