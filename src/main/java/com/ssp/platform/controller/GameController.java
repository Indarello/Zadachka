package com.ssp.platform.controller;

public class GameController
{
    //https://www.youtube.com/watch?v=TKiGTY6Aiis
    int P = 0;
    int E = 1;
    int H = 2;
    int I = 3;
    int C = 4;
    int L = 5;
    int N = 6;

    int[] letter = new int[9];
    int perenos1 = 0;
    int perenos2 = 0;
    int perenos3 = 0;
    public GameController()
    {
        letter[C] = 1;

        for (letter[I] = 0; letter[I] <= 5; letter[I]++)
        {
            perenos1 = 0;
            letter[N] = letter[I]*2;
            if(letter[N] > 9)
            {
                letter[N] -= 10;
                perenos1 = 1;
            }
            else if(letter[N] > 5) continue;

            for (letter[H] = 0; letter[H] <= 9; letter[H]++)
            {
                for (letter[L] = 0; letter[L] <= 5; letter[L]++)
                {
                    perenos2 = 0;
                    perenos3 = 0;
                    letter[E] = letter[H]+letter[L]+perenos1;

                    if(letter[E] > 9)
                    {
                        letter[E] -= 10;
                        perenos2 = 1;
                    }
                    else if(letter[E] > 5) continue;


                    int tempL = letter[E] + letter[C] + perenos2;
                    if(tempL > 9)
                    {
                        tempL -= 10;
                        perenos3 = 1;
                    }
                    if(tempL != letter[L]) continue;

                    letter[P] = letter[C]*10+letter[I]-letter[E];
                    if(letter[P] > 9) continue;

                    boolean nashliOdinakovie = false;
                    for (int i = 0; i <= 5; i++)
                    {
                        for (int b = i+1; b <= 6; b++)
                        {
                            if (letter[i] == letter[b])
                            {
                                nashliOdinakovie = true;
                                break;
                            }
                        }
                    }
                    if(!nashliOdinakovie) System.out.println("P = " + letter[P] + " E = " + letter[E] + " H = " + letter[H] + " I = " + letter[I]
                            + " C = " + letter[C] + " L = " + letter[L] + " N = " + letter[N]);
                }
            }
        }
    }
}
