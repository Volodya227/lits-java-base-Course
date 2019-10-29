package com.Homework7aboutZoo;

class Lion implements Animals {
    private String name;

    Lion(String name) {
        this.name = name;
        Voice voice = new LionsVoice();
        said(voice);
    }

    @Override
    public String eat(Food food) {
        if (food.type == "meat") {
            return "yammy";
        } else {
            return "lions don't eat " + food.name;
        }
    }

    class LionsVoice implements Voice {
        @Override
        public void voice() {
            System.out.println("harr");
        }
    }

    void said(Voice voice) {
        voice.voice();
    }


}
