package com.bridgelabz.gambling;

import java.util.Random;

public class CheckGamblingForTwentyDays {
    public static class GamblingSimulationProblem {
        //Default Constructor
        public GamblingSimulationProblem() {
            System.out.println("Welcome to Gambling Simulation Program");
            System.out.println();
            System.out.println("Gambler starts the game...");
        }

        //Declaring constants
        private final static int betMoney = 1;
        private final static int stakePerDay = 100;
        private final static double percentage = 0.5;   //as it is given 50%
        private final static int maxDays = 20;

        public static void main(String[] args) {

            //Initialize the object.
            GamblingSimulationProblem gambling = new GamblingSimulationProblem();
            System.out.println();
            System.out.println("Initial stake of Gambler is : " + stakePerDay);
            System.out.println("Initial betting money in gambling is : " + betMoney);
            System.out.println();
            startsGambling(gambling);

        }

        //Method for starting the game.
        public static void startsGambling(GamblingSimulationProblem gambling) {
            //Declaring variables
            Random random = new Random();
            int highestStake = (int) (stakePerDay + (stakePerDay * percentage));
            int lowestStake = (int) (stakePerDay - (stakePerDay * percentage));

            //Checking randomly if win or loose with the condition for 20 days
            checkingCondition(highestStake, lowestStake, random);
        }

        public static void checkingCondition(int highestStake, int lowestStake, Random random) {
            int totalWon = 0, totalLost = 0, totalDollars = 0, maxProfit = 0, maxLoss = 0, maxCount;
            for (int i = 1; i <= maxDays; i++) {
                int totalStake = stakePerDay;
                while (totalStake != highestStake && totalStake != lowestStake) {
                    int bet = random.nextInt(2);
                    switch (bet) {
                        case 1:
                            //Gambler Won
                            totalStake = totalStake + betMoney;
                            totalDollars = highestStake - stakePerDay;
                            maxProfit++;
                            break;
                        default:
                            //Gambler Lost
                            totalStake = totalStake - betMoney;
                            totalDollars = stakePerDay - lowestStake;
                            maxLoss++;
                            break;
                    }
                }
                System.out.println("Gambler resigns for the day " + i);
                System.out.println("Amount remaining at Gambler is : " + totalStake);
                System.out.println("Amount won count by Gambler : " + maxProfit + " for day " + i);
                System.out.println("Amount lost count by Gambler : " + maxLoss + " for day " + i);
                if (totalStake == highestStake) {
                    maxCount = maxProfit - maxLoss;
                    System.out.println("Gambler having highest won count : " + maxCount + " for the day " + i);
                    System.out.println("Gambler won by $" + totalDollars + " for the day " + i);
                    totalWon = totalWon + totalDollars;
                } else if (totalStake == lowestStake) {
                    maxCount = maxLoss - maxProfit;
                    System.out.println("Gambler having highest lost count : " + maxCount + " for the day " + i);
                    System.out.println("Gambler lost by $" + totalDollars + " for the day " + i);
                    totalLost = totalLost + totalDollars;
                }
                System.out.println();
            }
            if (totalWon > totalLost) {
                int total = totalWon - totalLost;
                System.out.println("Gambler having overall total won $" + total + " in this 20 days");
            } else if (totalLost > totalWon) {
                int total = totalLost - totalWon;
                System.out.println("Gambler having overall total lost $" + total + " in this 20 days");
            } else if (totalWon == totalLost) {
                System.out.println("Gambler neither having total won or total lost in this 20 days");
            }
        }

}

}
