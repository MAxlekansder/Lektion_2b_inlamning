package com.AlexanderHasslundShop.demo;


//fortsätt bygg lite på den här -> kika på hur vi kan implementera interface för produkter och se om vi kan välja där ifrån?
//dvs skapa en självcheckout grej -> priser etc. Ta med antalet sparade varor, räkna pris etc...
//kika även på om vi kan komma bort från "new obj" och få in dependency injections
public class Main {

    public static void main(String[] args) {
        Switchmenu switchmenu = new Switchmenu();
        switchmenu.switchMenu();
    }
}
