package com.Homework7aboutZoo;

class Rabbit implements Animals {
    private String name;

    Rabbit(String name) {
        this.name = name;
        Voice voice = new Rabbit.RabbitsVoice();
        said(voice);

    }

    @Override
    public String eat(Food food) {
        if (food.type == "vegetable") {
            return "crum - crum";
        } else {
            return "rabbits don't eat " + food.name;
        }
    }

    class RabbitsVoice implements Voice {
        @Override
        public void voice() {
            System.out.println("hahaha");
        }
    }

    void said(Voice voice) {
        voice.voice();
    }
}
