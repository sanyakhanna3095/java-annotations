package com.bridgelabz.exerciseProblems;

public class OldMethodDeprecated {
    static class LegacyAPI{
        @Deprecated
        public void oldFeature(){
            System.out.println("This feature is deprecated !");
        }

        public void newFeature() {
            System.out.println("This is the new feature.");
        }
    }

    public static void main(String[] args) {
        LegacyAPI dep=new LegacyAPI();
        dep.oldFeature();
        dep.newFeature();
    }
}
