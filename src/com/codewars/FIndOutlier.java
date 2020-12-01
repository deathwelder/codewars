package com.codewars;

public class FIndOutlier {
        static int find(int[] integers){
            int even = 0;
            int odd = 0;
            int evenInMass = 0;
            int oddInMass = 0;
            for (int i = 0; i < integers.length; i++) {
                int k = integers[i] % 2;
                if (k == 0) {
                    evenInMass = integers[i];
                    even++;
                } else {
                    oddInMass = integers[i];
                    odd++;}
            }

            if (even < odd) {
                return evenInMass;
            } else return oddInMass;
        }
    }

