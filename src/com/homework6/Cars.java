package com.homework6;

public enum Cars {
    Audi(1,"Audi"),
    Tesla(2,"tesla"),
    Sitroen(3,"sitroen"),
    Mersedes(4,"mersedes"),
    Ford(5,"ford"),
    Honda(6,"honda"),
    Woldswagen(7,"woldswagen"),
    Renought(8,"renought");
    int id;
    String code;
    public String getCode(){
        return code;
    }
    public int getId(){
        return id;
    }
    Cars(int id, String code) {
        this.id=id;
        this.code=code;
    }
    public static Cars findByCode(String code){
        for(Cars a:values()){
            if(a.getCode()==code){
                return a;
            }
        }
        return null;
    }
    public static Cars findById(int id){
        for(Cars a:values()){
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }
}
