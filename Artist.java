public class Artist{
    private String name;
    private String address;
    private String skill;
    private char m;

    Artist(){
        
    }

    public Artist(String name, String address, char m){
        this.name = name;
        this.address = address;
        this.m = m;
    }

    public String getName(){
        return name;
    }

    public String getSkill(){
        return this.skill;
    }
    public void SetSkill(String skill){
        this.skill = skill;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public char getGender(){
        return m;
    }    
}