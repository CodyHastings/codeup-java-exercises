import javax.lang.model.SourceVersion;

public class ServerNameGenerator {

    public static String randomElementFromArray(String[] string){

        int anum = (int) Math.floor(Math.random() * 10);

        return string[anum];

    }

    public static void main(String[] args) {
        String[] adjArr = {"Elated", "Pale", "Daily", "Caring", "Kind", "Delirious", "Tan", "Hanging", "Wonderful", "Rambunctious", "Cruel", "Crabby"};
        String[] nounArr ={"BobSaget", "Quasar", "Starbuck", "BlackWake", "Vsauce", "PBSSpacetime", "Wookie", "Darth", "RiskOfRain", "ProtestTheHero"};
        randomElementFromArray(adjArr);

        System.out.println("Your random server name is : " + randomElementFromArray(adjArr) + "-" + randomElementFromArray(nounArr));
    }

}
