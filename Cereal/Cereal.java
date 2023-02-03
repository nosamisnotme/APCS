public class Cereal {
    private String cereal;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int fiber;
    private int carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private int weight;
    private Double cups;
    private Double rating;

    public Cereal(String cereal, String type, int calories, int protein, int fat, int sodium, int fiber, int carbohydrates, int sugar, int potassium, int vitamins, int shelf, int weight, double d, double e){
        this.cereal = cereal;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = d;
        this.rating = e;
    }
    String getCereal(){
        return cereal;
    }
    String getType(){
        return type;
    }
    int getCalories(){
        return calories;
    }
    int getProtein(){
        return protein;
    }
    int getFat(){
        return fat;
    }
    int getSodium(){
        return sodium;
    }
    int getFiber(){
        return fiber;
    }
    int getCarbohydrates(){
        return carbohydrates;
    }
    int getSugar(){
        return sugar;
    }
    int getPotassium(){
        return potassium;
    }
    int getVitamins(){
        return vitamins;
    }
    int getShelf(){
        return shelf;
    }
    int getWeight(){
        return weight;
    }
    Double getCups(){
        return cups;
    }
    Double getRating(){
        return rating;
    }
    public String toString(){
        return (getCereal() + " has " + getSugar() + " sugars and " + getCalories() + " calories.");
    }
    
}
