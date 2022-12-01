public class TestArtist {
    public static void main (String args[])
    {
        Artist a = new Artist("Sahcin", null,'m');
        System.out.println("Name: "+a.getName()); 
        a.SetSkill("Graphical Designing");
        System.out.println("Skill: " +a.getSkill());
        a.setAddress("Birla Zuari");  
        System.out.println("Address: "+a.getAddress()); 
        System.out.println("Gender: "+a.getGender());
         
    }
}
