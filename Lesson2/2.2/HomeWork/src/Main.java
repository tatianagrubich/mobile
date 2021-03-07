public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int mashaAge = 22;
        int mishaAge =35;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge > mashaAge && vasyaAge > mishaAge && (mashaAge > mishaAge)) {
            max = vasyaAge;
            middle = mashaAge;
            min = mishaAge;
        } else {
            if (vasyaAge > mashaAge && vasyaAge > mishaAge && (mashaAge < mishaAge)) {
                max = vasyaAge;
                middle = mishaAge;
                min = mashaAge;
            } else {
                if (mashaAge > vasyaAge && mashaAge > mishaAge && (vasyaAge > mishaAge)) {
                    max = mashaAge;
                    middle = vasyaAge;
                    min = mishaAge;
                } else {
                    if (mashaAge > vasyaAge && mashaAge > mishaAge && (vasyaAge < mishaAge)) {
                        max = mashaAge;
                        middle = mishaAge;
                        min = vasyaAge;
                    } else {
                        if (vasyaAge > mashaAge) {
                            max = mishaAge;
                            middle = vasyaAge;
                            min = mashaAge;
                        } else {
                            max = mishaAge;
                            middle = mashaAge;
                            min = vasyaAge;
                        }
                    }
                }

            }
        }
        System.out.println("max age = " + max + "     middle age = " + middle + "     min age = "+ min);
    }

}
