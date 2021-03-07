import java.awt.Color;

public class Cat {
    public static int count;

    public static final int COUNT_EYES = 2;
    public static final int MAX_WEIGHT = 2500; //g
    public static final int MIN_WEIGHT = 3000; //g


    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double score;
    private double ownWeight;
    private String ownColor;
    private String name;
    private Color color;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public Cat(double ownWeight) {
        this();
        this.ownWeight = ownWeight;
    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOwnColor(String ownColor) {
        this.ownColor = ownColor;
    }

    public String getOwnColor() {
        return ownColor;
    }


    public double getOwnWeight() {
        return ownWeight;
    }

    public static int getCount() {
        return count;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void meow() {
        if (weight > minWeight && weight < maxWeight) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < minWeight) {
                count--;
            }
        } else {
            System.out.println("Кошка мертва и мяукать не может, к сожалению :( ");
        }
    }

    public void feed(Double amount) {
        score = amount;
        if (weight > minWeight && weight < maxWeight) {
            weight = weight + amount;
            if (weight > maxWeight) {
                count--;
            }
        } else {
            System.out.println("Кошка мертва и кушать не может, к сожалению :( ");
        }
    }

    public void drink(Double amount) {
        if (weight > minWeight && weight < maxWeight) {
            weight = weight + amount;
            if (weight > maxWeight) {
                count--;
            }
        } else {
            System.out.println("Кошка мертва и пить не может, к сожалению :( ");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public Double getMinWeight() {
        return minWeight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public double getMeals() {
        return score;
    }

    public void Restroom() {
        if (weight > minWeight && weight < maxWeight) {
            weight = weight - 200;
            System.out.println("Кошка была в туалете");
            if (weight < minWeight) {
                count--;
                System.out.println("Кошка не существует");
            }
        } else {
            System.out.println("Кошка мертва и ничего уже не может, к сожалению :( ");
        }
    }
}