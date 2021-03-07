public class Main {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        String[] newMas;
        newMas = new String[colors.length];

        for (i = colors.length - 1; i >= 0; i--) {
            newMas[j] = colors[i];
            j++;
        }

        for (j = 0; j < newMas.length; j++) {
            colors[j] = newMas[j];
        }


        for (i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}
