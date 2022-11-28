package com.bridgelabz.gambling;

public class UC1GamblerStartTheGame {
    public static class GamblingSimulationProblem {
        //default constructor
        public GamblingSimulationProblem() {
            System.out.println("Welcome to Gambling Simulation Program");
            System.out.println();
            System.out.println("Gambler starts the game...");
        }

        //Declaring constants
        private final static int betMoney = 1;
        private final static int stakePerDay = 100;

        public static void main(String[] args) {

            //Initialize the object.
            GamblingSimulationProblem gambling = new GamblingSimulationProblem();
            System.out.println();
            System.out.println("Initial stake of Gambler is : " + stakePerDay);
            System.out.println("Initial betting money in gambling is : " + betMoney);
            System.out.println();


        }

    }
}
