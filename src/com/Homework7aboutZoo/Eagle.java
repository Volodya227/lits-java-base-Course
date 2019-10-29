package com.Homework7aboutZoo;

class Eagle implements Animals {
    private String name;

    Eagle(String name) {
        this.name = name;
        Voice voice = new Eagle.EaglesVoice();
        said(voice);

    }

    @Override
    public String eat(Food food) {
        if (food.type == "meat" && food.weight <= 1) {
            return "yammy";
        } else if (food.type == "meat" && food.weight > 1) {
            return "this is too big";
        } else {
            return "eagles don't eat " + food.name;
        }
    }

    class EaglesVoice implements Voice {
        @Override
        public void voice() {
            System.out.println("hooh");
        }
    }

    void said(Voice voice) {
        voice.voice();
    }


}
