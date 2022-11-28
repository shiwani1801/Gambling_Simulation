package com.bridgelabz.gambling;

import java.util.Random;

public class CheckWheatherGamblerWinOrLoss {
    public static class GamblingSimulationProblem {
        //Default Constructor
        public GamblingSimulationProblem() {
            System.out.println("Welcome to Gambling Simulation Program");
            System.out.println();
            System.out.println("Gambler starts the game...");
        }

        //Declaring constants
        final int betMoney = 1;
        final int stakePerDay = 100;

        public static void main(String[] args) {

            //Initialize the object.
            GamblingSimulationProblem gambling = new GamblingSimulationProblem();
            System.out.println();
            System.out.println("Initial stake of Gambler is : " + gambling.stakePerDay);
            startsGambling(gambling);

        }

        //Method for starting the game.
        public static void startsGambling(GamblingSimulationProblem gambling) {
            //Declaring variables
            Random random = new Random();
            int stake = 0;
            stake = stake + gambling.stakePerDay;
            int bet = random.nextInt(2);

            //Checking randomly if win or loose.
            switch (bet) {
                case 1:
                    System.out.println("Gambler won the bet.");
                    stake = stake + gambling.betMoney;
                    break;
                default:
                    System.out.println("Gambler lost the bet.");
                    stake = stake - gambling.betMoney;
                    break;
            }

            System.out.println("Amount remaining at Gambler is : " + stake);

        }
    }
}

