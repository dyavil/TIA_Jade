/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyon1.jadeproject.main;

import jade.Boot;
import lyon1.jadeproject.agents.MyTestAgent;
/**
 *
 * @author dyavil
 */
public class Main {
    public static void main(String[] args){
        String[] param = new String[ 3 ];
        param[ 0 ] = "-gui";
        param[ 1 ] = "-agents";
        param[ 2 ] = "MyTestAgent1:lyon1.jadeproject.agents.MyTestAgent;MyTestAgent2:lyon1.jadeproject.agents.MyTestAgent";
        System.out.println(param[ 2 ]);
        Boot.main( param );
    }
}
