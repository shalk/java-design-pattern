package com.xshalk.proxy.dynamic;

public class PersonBeanImpl implements PersonBean {
    private String name;
    private String gender;
    private String interests;
    private int ratingCount;
    private int rating;

    public PersonBeanImpl(String name, String gender, String interests, int ratingCount, int rating) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.ratingCount = ratingCount;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0)
            return 0;
        return rating / ratingCount;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    @Override
    public String toString() {
        return "PersonBeanImpl{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", interests='" + interests + '\'' +
                ", ratingCount=" + ratingCount +
                ", rating=" + rating +
                '}';
    }
}
