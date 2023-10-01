package learning.DesignPatterns_SpringBoot.model;

import jakarta.persistence.*;

@Entity
public class Dog {
    @Id
    private String name;
    private String image_link;
    private int good_with_children;
    private int good_with_other_dogs;
    private int shedding;
    private int grooming;
    private int drooling;
    private int coat_length;
    private int good_with_strangers;
    private int playfulness;
    private int protectiveness;
    private int trainability;
    private int energy;
    private int barking;
    private int min_life_expectancy;
    private int max_life_expectancy;
    private int max_height_male;
    private int max_height_female;
    private int max_weight_male;
    private int max_weight_female;
    private int min_height_male;
    private int min_height_female;
    private int min_weight_male;
    private int min_weight_female;



    // Getter Methods
    public String getImage_link() {
        return image_link;
    }

    public float getGood_with_children() {
        return good_with_children;
    }

    public float getGood_with_other_dogs() {
        return good_with_other_dogs;
    }

    public float getShedding() {
        return shedding;
    }

    public float getGrooming() {
        return grooming;
    }

    public float getDrooling() {
        return drooling;
    }

    public float getCoat_length() {
        return coat_length;
    }

    public float getGood_with_strangers() {
        return good_with_strangers;
    }

    public float getPlayfulness() {
        return playfulness;
    }

    public float getProtectiveness() {
        return protectiveness;
    }

    public float getTrainability() {
        return trainability;
    }

    public float getEnergy() {
        return energy;
    }

    public float getBarking() {
        return barking;
    }

    public float getMin_life_expectancy() {
        return min_life_expectancy;
    }

    public float getMax_life_expectancy() {
        return max_life_expectancy;
    }

    public float getMax_height_male() {
        return max_height_male;
    }

    public float getMax_height_female() {
        return max_height_female;
    }

    public float getMax_weight_male() {
        return max_weight_male;
    }

    public float getMax_weight_female() {
        return max_weight_female;
    }

    public float getMin_height_male() {
        return min_height_male;
    }

    public float getMin_height_female() {
        return min_height_female;
    }

    public float getMin_weight_male() {
        return min_weight_male;
    }

    public float getMin_weight_female() {
        return min_weight_female;
    }

    public String getName() {
        return name;
    }

    // Setter Methods
    public void setImage_link( String image_link ) {
        this.image_link = image_link;
    }

    public void setGood_with_children( int good_with_children ) {
        this.good_with_children = good_with_children;
    }

    public void setGood_with_other_dogs( int good_with_other_dogs ) {
        this.good_with_other_dogs = good_with_other_dogs;
    }

    public void setShedding( int shedding ) {
        this.shedding = shedding;
    }

    public void setGrooming( int grooming ) {
        this.grooming = grooming;
    }

    public void setDrooling( int drooling ) {
        this.drooling = drooling;
    }

    public void setCoat_length( int coat_length ) {
        this.coat_length = coat_length;
    }

    public void setGood_with_strangers( int good_with_strangers ) {
        this.good_with_strangers = good_with_strangers;
    }

    public void setPlayfulness( int playfulness ) {
        this.playfulness = playfulness;
    }

    public void setProtectiveness( int protectiveness ) {
        this.protectiveness = protectiveness;
    }

    public void setTrainability( int trainability ) {
        this.trainability = trainability;
    }

    public void setEnergy( int energy ) {
        this.energy = energy;
    }

    public void setBarking( int barking ) {
        this.barking = barking;
    }

    public void setMin_life_expectancy( int min_life_expectancy ) {
        this.min_life_expectancy = min_life_expectancy;
    }

    public void setMax_life_expectancy( int max_life_expectancy ) {
        this.max_life_expectancy = max_life_expectancy;
    }

    public void setMax_height_male( int max_height_male ) {
        this.max_height_male = max_height_male;
    }

    public void setMax_height_female( int max_height_female ) {
        this.max_height_female = max_height_female;
    }

    public void setMax_weight_male( int max_weight_male ) {
        this.max_weight_male = max_weight_male;
    }

    public void setMax_weight_female( int max_weight_female ) {
        this.max_weight_female = max_weight_female;
    }

    public void setMin_height_male( int min_height_male ) {
        this.min_height_male = min_height_male;
    }

    public void setMin_height_female( int min_height_female ) {
        this.min_height_female = min_height_female;
    }

    public void setMin_weight_male( int min_weight_male ) {
        this.min_weight_male = min_weight_male;
    }

    public void setMin_weight_female( int min_weight_female ) {
        this.min_weight_female = min_weight_female;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
